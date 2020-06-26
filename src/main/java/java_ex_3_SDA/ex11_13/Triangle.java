package java_ex_3_SDA.ex11_13;

public class Triangle implements Field {

    private double height;
    private double baseLength;

    public Triangle(double height, double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public double getArea() {
        return (0.5 * height * baseLength);
    }
}
