package cinema.service;
import cinema.dto.Purchase;
import cinema.model.Seat;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public interface RoomService {
    LinkedList creatRoom();
    List<Seat>getAvailableSeats();
    int getTOTAL_ROWS();
    int getTOTAL_COLUMNS();

    boolean isAvailable(int row, int column);
    int getIndex();
    void addSale(Purchase purchase);
    void deleteSale(Purchase purchase);
    void changeAvailability(Seat s);
    Purchase getByToken(UUID token);

    boolean outOfRange(int row, int column);
    boolean isInRange(int value);
    int getSeatIndex(Seat s);

    int getCurrentIncome();
    int getPurchasedTickets();
    int getAvailableSeatsLength();





}
