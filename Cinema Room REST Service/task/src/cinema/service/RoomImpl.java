package cinema.service;

import cinema.dto.Purchase;
import cinema.dto.Token;
import cinema.model.Seat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Configuration
public class RoomImpl implements RoomService {
    int TOTAL_ROWS = 9;
    int TOTAL_COLUMNS = 9;
    LinkedList<Seat> seatsInRoom = new LinkedList<>();
    LinkedList<Purchase> ticketsSold = new LinkedList<>();



    int index = 0;



    public RoomImpl() {
        if (seatsInRoom.size() == 0){
            creatRoom();
        }

    }

    @Override
    public LinkedList creatRoom() {

        //Row
        for (int i = 0; i < TOTAL_ROWS; i++) {
            int column = 1;
            int row = i+1;

            //column
            while (column < TOTAL_COLUMNS + 1){
                seatsInRoom.add(new Seat(row, column, true));
                column++;
            }
        }

        return seatsInRoom;
    }

    @Bean
    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats;

        availableSeats = seatsInRoom
                          .stream()
                          .filter((s) -> s.isAvailable() == true)
                          .collect(Collectors.toList());

        return availableSeats;
    }

    public int getTOTAL_ROWS() {
        return TOTAL_ROWS;
    }

    public int getTOTAL_COLUMNS() {
        return TOTAL_COLUMNS;
    }

    @Override
    public boolean isAvailable(int row, int column) {

        for (Seat seat: seatsInRoom) {
            int r = seat.getRow();
            int c = seat.getColumn();

            if (r == row && c == column && seat.isAvailable()){
                this.index = seatsInRoom.indexOf(seat);
                seat.setAvailable(false);
                return true;
            }

        }

        return false;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void addSale(Purchase purchase) {
        ticketsSold.add(purchase);

    }

    @Override
    public void deleteSale(Purchase purchase) {
        ticketsSold.remove(purchase);
    }

    @Override
    public void changeAvailability(Seat s) {

        int i = getSeatIndex(s);
        Seat seat =seatsInRoom.get(i);
        seat.setAvailable(true);
    }

    @Override
    public Purchase getByToken(UUID token) {
        for (Purchase purchase: ticketsSold) {

            if(purchase != null && purchase.getToken().equals(token)){
                return purchase;
            }
        }
        return null;
    }


    @Override
    public boolean outOfRange(int row, int column) {
        if(!isInRange(row) || !isInRange(column)){

            return true;
        }
        return false;
    }

    @Override
    public boolean isInRange(int value) {
        if(value > 9 || value < 0){
            return false;
        }
        return true;
    }

    @Override
    public int getSeatIndex(Seat s) {
        for (Seat seat: seatsInRoom) {
            int r = seat.getRow();
            int c = seat.getColumn();


            if (r == s.getRow() && c == s.getColumn()){

                return seatsInRoom.indexOf(seat);
            }

        }

        return -1;
    }

    @Override
    public int getCurrentIncome() {
        int currentIncome =0;
        for (Purchase purchase : ticketsSold) {
            currentIncome += purchase.getTicket().getPrice();
        }
        return currentIncome;
    }

    @Override
    public int getPurchasedTickets() {
        return ticketsSold.size();
    }

    @Override
    public int getAvailableSeatsLength() {
        return (TOTAL_ROWS*TOTAL_COLUMNS)-ticketsSold.size();
    }


}
