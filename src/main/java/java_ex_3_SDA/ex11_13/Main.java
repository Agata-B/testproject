package java_ex_3_SDA.ex11_13;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Pole prostokąta wynosi " + rectangle.getArea());

        Circle circle = new Circle(3);
        System.out.println("Pole koła wynosi " + circle.getArea());

        Triangle triangle = new Triangle(6, 7);
        System.out.println("Pole trójkąta wynosi " + triangle.getArea());

        /*double[] fields = new double[3];
        fields[0] = rectangle.getArea();
        fields[1] = circle.getArea();
        fields[2] = triangle.getArea();

        double sumField = 0;
        for (int i = 0; i <= fields.length - 1; i++) {
            sumField += fields[i];
        }
        System.out.println("Suma pól figur wynosi " + sumField);
      */

        Field [] fields = {rectangle, circle, triangle};
        SumField sumField = new SumField();
        System.out.println(sumField.returnSumField(fields));
        IsEnoughPaint isEnoughPaint = new IsEnoughPaint();
        System.out.println("Czy wystarczy farby na pomalowanie figur? opd. " + isEnoughPaint.isEnoughPaint(fields, 61.27433388230814));

    }
}
