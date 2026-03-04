package game.engine.exceptions;

public class OutOfEnergyException extends RuntimeException {
    private static final String MSG="Not Enough Energy for Power Up";

    public OutOfEnergyException(String message) {
        super(message);
    }

    public OutOfEnergyException(){
        super(MSG);
    }
}
