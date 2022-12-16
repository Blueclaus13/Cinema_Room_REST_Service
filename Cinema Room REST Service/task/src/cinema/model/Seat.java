package cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Seat {

    private int row;
    private int column;
    private int price;

    @JsonIgnore
    private boolean isAvailable;




    public Seat() {
    }

    public Seat(int row, int column, boolean isAvailable) {
        this.row = row;
        this.column = column;
        this.isAvailable = isAvailable;
        this.price = row <= 4 ? 10 : 8;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @JsonIgnore
    public boolean isAvailable() {
                return isAvailable;
            }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }




}
