package lesson9.task1;

public class WrongLoginException extends Exception {
    private int detail;

    public WrongLoginException(int detail, String message){
        super(message);
        this.detail = detail;
    }

    public WrongLoginException() {

    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "detail = " + detail +
                " message = " + getMessage() +
                '}';
    }
}
