package java_ex_3_SDA.ex11_13;

public class SumField {

    public double returnSumField(Field[] fields){
        double sumField = 0;
        for (Field figure:fields) {
            sumField += figure.getArea();
        } return sumField;

    }
}
