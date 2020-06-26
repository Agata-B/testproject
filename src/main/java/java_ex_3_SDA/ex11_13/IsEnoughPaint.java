package java_ex_3_SDA.ex11_13;

public class IsEnoughPaint {
    public boolean isEnoughPaint(Field[] fields, double areaPossible) {
        double sumField = 0;
        for (Field figure : fields) {
            sumField += figure.getArea();
        }
        return sumField <= areaPossible;

    }
}
