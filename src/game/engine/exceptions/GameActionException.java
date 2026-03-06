package game.engine.exceptions;

public abstract class GameActionException extends Exception {
    public GameActionException(String message) {
        super(message);
    }

    public GameActionException(){
        super();
    }
}
