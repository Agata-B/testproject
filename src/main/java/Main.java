import homework1SDA.Ex1_3;
import homework1SDA.Ex4_6;
import homework1SDA.Ex7_10;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ex1_3 .1");
        Ex1_3 ex1_3 = new Ex1_3();
        ex1_3.multiplicationTable(3);
        System.out.println();

        System.out.println("Ex1_3 .2");
        System.out.println(ex1_3.itIsAPrimeNumber());
        System.out.println();

        System.out.println("Ex1_3 .3");
        System.out.println(ex1_3.addRange(1,3));
        System.out.println();

        System.out.println("Ex4_6 .4");
        int[] tab = {5, 20, 63};
        Ex4_6.invertedArray(tab);
        System.out.println();

        System.out.println("Ex4_6 .5");
        int[] array = {10, 2, 150};
        Ex4_6.minMaxValue(array);
        System.out.println();


        System.out.println("Ex4_6 .6");
        int [] table = {-2, 20, -15, 1, -4};
        Ex4_6.arrayPrinter(table);
        System.out.println();
        int [] minusTable = Ex4_6.counterMinusValue(table);
        Ex4_6.arrayPrinter(minusTable);
        System.out.println('\n');

        System.out.println("Ex7_10 .7");
        Ex7_10.createArithmeticSeries(4,1,3);
        System.out.println();

        System.out.println("Ex7_10 .8");
        int[] exampleTab = {2, 3, 6} ;
        System.out.println("Czy podany ciąg liczb, jest ciągiem artymetycznym: " + Ex7_10.isThatSeries(exampleTab)+ '\n');

        System.out.println("Ex7_10 .9");
        System.out.println("Reszta z dzielenia to : " + Ex7_10.myModulo(3,2));
        System.out.println();

        System.out.println("Ex7_10 .10");
        int [ ]testNumb = {5,2,3,15};
        System.out.println(Ex7_10.comparisionModuloAndMyModulo(testNumb,2));
    }
}

