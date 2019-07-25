package ReadingFile.src.com.epam.file;

import java.io.IOException;

public class MethodReadLineException extends IOException {

    public MethodReadLineException() {
        super();
    }

    public MethodReadLineException(String message) {
        super(message);
    }

    public MethodReadLineException(String message, Throwable cause) {
        super(message, cause);
    }

    public MethodReadLineException(Throwable cause) {
        super(cause);
    }
}
