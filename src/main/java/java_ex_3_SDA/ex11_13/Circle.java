package java_ex_3_SDA.ex11_13;

public class Circle  implements Field{

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*radius*radius);
    }
}
