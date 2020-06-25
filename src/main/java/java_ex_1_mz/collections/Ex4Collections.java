package java_ex_1_mz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex4Collections {
    //4. Utwórz listę ArrayList przechowującą imiona.
    //a. Dodaj 5 imion do listy,
    //b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
    //c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
    //zaczynając od ostatniego, a kończąc na pierwszym.

    public void printNameList() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Kamil");
        nameList.add("Małgosia");
        nameList.add("Karolina");
        nameList.add("Tadeusz");
        nameList.add("Kornel");

        System.out.print("Lista dodanych imion: ");
        for (String name : nameList) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.print("Lista dodanych imion od końca: ");
        Collections.reverse(nameList);                           //method in the collection inverting the list or  for(int i = listOfName.size()-1; i >= 0; i-- ){System.out.print(listOfName.get( i ) + " | "); }
        for (String name : nameList) {
            System.out.print(name + " ");
        }
    }
}
