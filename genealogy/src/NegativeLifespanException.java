public class NegativeLifespanException extends RuntimeException {
    public NegativeLifespanException() {
        super("Ujemna długość życia");
    }
}
