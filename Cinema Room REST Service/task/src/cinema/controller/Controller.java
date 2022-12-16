package cinema.controller;

import cinema.constants.EnumMessage;
import cinema.dto.*;
import cinema.model.Seat;
import cinema.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    private final RoomService roomService;



    @Autowired
    public Controller(RoomService roomService) {
        this.roomService = roomService;

    }

    @GetMapping("/seats")
    public ResponseEntity<PageDTO> getSeats(){
        PageDTO p = new PageDTO();

        p.setTotalRows(roomService.getTOTAL_ROWS());
        p.setTotalColumns(roomService.getTOTAL_COLUMNS());
        p.setAvailableSeats(roomService.getAvailableSeats());

        return ResponseEntity.ok(p);

    }

    @PostMapping("/purchase")
    public ResponseEntity<?> purchase(@RequestBody Seat seat){

        //System.out.print("inside purchased");
        //Input's validation
        if (seat == null
                || roomService.outOfRange(seat.getRow(),
                seat.getColumn())){

            return new ResponseEntity<>(new ErrorMessage(EnumMessage.OUT_OF_BOUNDS.getMessage()), HttpStatus.BAD_REQUEST);
        }

        //Checking if the seat is available
        boolean isAvailable =roomService
                .isAvailable(seat.getRow(),seat.getColumn());
        //Purchase
        if(isAvailable) {
            seat.setPrice(seat.getRow() <= 4 ? 10 : 8);
            Purchase purchase = new Purchase(seat);
            roomService.addSale(purchase);
            return ResponseEntity.ok(purchase);
        } else {

            return  new ResponseEntity<>(new ErrorMessage(EnumMessage.PURCHASED.getMessage()), HttpStatus.BAD_REQUEST);

        }

    }
    @PostMapping("/return")
    public ResponseEntity<?> refund(@RequestBody Token token) {


        Purchase purchaseToReturn = roomService.getByToken(token.getToken());

        if (purchaseToReturn == null) {
            return new ResponseEntity<>(new ErrorMessage(EnumMessage.WRONG_TOKEN.getMessage()),HttpStatus.BAD_REQUEST);
        } else {
            roomService.changeAvailability(purchaseToReturn.getTicket());
            roomService.deleteSale(purchaseToReturn);
            return ResponseEntity.ok(new Refund(purchaseToReturn.getTicket()));
        }

    }

    @PostMapping("/stats")
    public ResponseEntity<?> stats(
            @RequestParam( required = false) String password){

        if(password != null && password.equals("super_secret")){

            Stadistics stats = new Stadistics(
                    roomService.getCurrentIncome(),
                    roomService.getAvailableSeatsLength(),
                    roomService.getPurchasedTickets()
            );
            return ResponseEntity.ok(stats);

        }else{
            return new ResponseEntity<>(new ErrorMessage(EnumMessage.WRONG_PASSWORD.getMessage()),HttpStatus.UNAUTHORIZED);
        }

    }


}
