package chess;

import boardgame.BoarException;

import java.io.Serial;

public class ChessException extends BoarException {

    @Serial
    private static final long serialVersionUID = 1L;
    public ChessException(String message) {

        super(message);
    }
}
