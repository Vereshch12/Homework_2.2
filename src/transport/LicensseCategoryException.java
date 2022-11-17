package transport;

public class LicensseCategoryException extends Exception{

    public LicensseCategoryException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public LicensseCategoryException() {
    }
}
