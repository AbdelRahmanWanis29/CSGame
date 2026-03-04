package game.engine.exceptions;

public class GameActionException extends RuntimeException {
    public GameActionException(String message) {
        super(message);
    }

    public GameActionException(){
        super();
    }
}
