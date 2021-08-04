import java.lang.invoke.WrongMethodTypeException;

public class PointCountException extends Exception {

    public PointCountException(String wrongNumberOfPoints) {
        super(wrongNumberOfPoints);
    }
}
