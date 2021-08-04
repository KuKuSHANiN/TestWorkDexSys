public class PointTypeException extends Exception {
    public PointTypeException(NumberFormatException wrongPointType) {
        super(wrongPointType);
    }
}
