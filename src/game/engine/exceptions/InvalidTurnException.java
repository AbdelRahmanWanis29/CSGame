package game.engine.exceptions;

public class InvalidTurnException extends GameActionException {
    private static final String MSG="Action done on wrong turn";

    public InvalidTurnException(String message) {
        super(message);
    }

    public InvalidTurnException() {
        super(MSG);
    }
}
