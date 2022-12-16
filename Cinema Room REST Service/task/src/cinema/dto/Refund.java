package cinema.dto;

import cinema.model.Seat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Refund {
    @JsonProperty("returned_ticket")
    Seat refund;

    public Refund(Seat refund) {
        this.refund = refund;
    }

    public Seat getRefund() {
        return refund;
    }

    public void setRefund(Seat refund) {
        this.refund = refund;
    }
}
