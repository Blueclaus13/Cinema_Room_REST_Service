package cinema.constants;

public enum EnumMessage {
    OUT_OF_BOUNDS("The number of a row or a column is out of bounds!"),
    WRONG_TOKEN("Wrong token!"),
    WRONG_PASSWORD("The password is wrong!"),
    PURCHASED("The ticket has been already purchased!");

   private String message;

    private EnumMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
