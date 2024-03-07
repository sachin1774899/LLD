package BuilderDesignPattern.Exceptions;

public class InvalidYearException extends RuntimeException{
    public InvalidYearException() {
    }

    public InvalidYearException(String message) {
        super(message);
    }

    public InvalidYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYearException(Throwable cause) {
        super(cause);
    }

    public InvalidYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
