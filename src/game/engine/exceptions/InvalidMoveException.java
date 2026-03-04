package game.engine.exceptions;

public class InvalidMoveException extends RuntimeException {
    private static final String MSG="Invalid move attempted";

    public InvalidMoveException(String message) {
        super(message);
    }

    public InvalidMoveException() {
        super(MSG);
    }
}
