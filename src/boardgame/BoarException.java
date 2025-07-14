package boardgame;

import java.io.Serial;

public class BoarException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;
    public BoarException(String message) {

        super(message);
    }
}
