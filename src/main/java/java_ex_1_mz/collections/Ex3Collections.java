package java_ex_1_mz.collections;

import java.util.ArrayList;
import java.util.List;

public class Ex3Collections {
    //3. Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
    //liczb do listy.
    //a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
    //b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
    //c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.

    public void doubleListEx() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.4);
        doubleList.add(1.8);
        doubleList.add(8.9);
        doubleList.add(1.11);
        doubleList.add(11.3);
        doubleList.add(4.2);
        doubleList.add(1.0);
        doubleList.add(2.1);
        doubleList.add(1.9);

        System.out.print("Lista liczb zmiennoprzecinkowych: " + doubleList);
        //for (double doubleNumber :doubleList) {
          //  System.out.print(doubleNumber + " ");
        //}
        System.out.println();
        double a = doubleList.get(0);
        double b = doubleList.get(doubleList.size()-1);
        System.out.println("Suma pierwszego i ostatniego elementu zapisanego w liście: " + (a + b));
        System.out.println("Iloczyn pierwszego i ostatniego elementu zapisanego w liście: " + (a * b));
        double c = doubleList.get(1);
        double e = doubleList.get(doubleList.size()-2);
        System.out.println("Iloraz drugirgo i przedostatniego elementu zapisanego w liście: " + (c/e));
    }

}
