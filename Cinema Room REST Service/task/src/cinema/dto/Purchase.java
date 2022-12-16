package cinema.dto;

import cinema.model.Seat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Purchase {

    private UUID token;
    private Seat ticket;

    public Purchase( Seat ticket) {
        this.token = UUID.randomUUID();

        this.ticket = ticket;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }

    public Seat getTicket() {
        return ticket;
    }

    public void setTicket(Seat ticket) {
        this.ticket = ticket;
    }
}
