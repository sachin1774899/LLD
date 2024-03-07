package BuilderDesignPattern.Exceptions;

public class InvalidNamesException extends RuntimeException{
    public InvalidNamesException() {
    }

    public InvalidNamesException(String message) {
        super(message);
    }

    public InvalidNamesException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNamesException(Throwable cause) {
        super(cause);
    }

    public InvalidNamesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
