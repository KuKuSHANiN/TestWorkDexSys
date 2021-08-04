public class Point {
    // сделать иммутабельным
    private double axisX;
    private double axisY;

    public Point(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public double getAxisX() {
        return axisX;
    }

    public double getAxisY() {
        return axisY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "axisX=" + axisX +
                ", axisY=" + axisY +
                '}';
    }
}
