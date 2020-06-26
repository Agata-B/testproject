package java_ex_3_SDA.ex11_13;

public class Circle  implements Field{

    private double radius;
private double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (PI*radius*radius);
    }
}
