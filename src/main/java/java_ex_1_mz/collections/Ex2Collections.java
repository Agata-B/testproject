package java_ex_1_mz.collections;

import java.util.ArrayList;
import java.util.List;

public class Ex2Collections {

    //2. Utwórz listę ArrayList przechowującą liczby całkowite.
    //a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
    //b. Wyświetl pierwszy element zapisany w liście.
    //c. Wyświetl ostatni element zapisany w liście
    public void numList() {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(4);
        numberList.add(10);
        System.out.println("Długość listy "+ numberList.size());
        System.out.println("Pierwszy element na liście: " + numberList.get(0));
        //System.out.println("Ostatni element na liście: " + numberList.get(2));
        System.out.println("Ostatni element na liście: " + numberList.get(numberList.size()-1));
    }
}
