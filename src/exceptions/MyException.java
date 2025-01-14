package exceptions;

import java.util.Arrays;
import java.util.List;

public class MyException extends Exception {
    public static final int ERROR_0 = 0;
    public static final int ERROR_1 = 1;
    public static final int ERROR_2 = 2;
    private final int value;

    public MyException(int value) {
        this.value = value;
    }

    private final List<String> message = Arrays.asList(
            "This is my error 0",
            "This is my error 1",
            "This is my error 2"
    );

    @Override
    public String getMessage() {
        return message.get(value);
    }
}
