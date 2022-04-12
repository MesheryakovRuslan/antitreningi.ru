package lesson9.task1;

public class WrongPasswordException extends Exception {
    private int detail;

    WrongPasswordException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    WrongPasswordException(){

    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "detail = " + detail +
                " message = " + getMessage() +
                '}';
    }
}
