package cinema.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PageDTO<T> {

    @JsonProperty("total_rows")
    private int totalRows;
    @JsonProperty("total_columns")
    private int totalColumns;
    @JsonProperty("available_seats")
    private List<T> availableSeats;

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public List<T> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<T> availableSeats) {
        this.availableSeats = availableSeats;
    }
}