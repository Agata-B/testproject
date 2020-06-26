package java_ex_3_SDA.ex11_13;

public class Rectangle implements Field {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (height*width);
    }
}
