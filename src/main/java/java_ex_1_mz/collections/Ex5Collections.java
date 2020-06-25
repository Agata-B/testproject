package java_ex_1_mz.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5Collections {

    //5. Utwórz tablicę ArrayList przechowującą imiona
    //a. Korzystając z klasy Scanner pobierz od użytkownika 3 imion i zapisz je w
    //liście.
    //b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
    //liście.

    public void getNames() {
        List<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int e = 0; e < 3; e++) {
            System.out.println("Podaj imię.");
            String temporary = scanner.next();
            nameList.add(temporary);
        }

        System.out.print("Lista imion: ");
        int i = 0;
        while (i <= nameList.size() - 1) {
            System.out.print(nameList.get(i) + " ");
            i++;
        }
    }
}
