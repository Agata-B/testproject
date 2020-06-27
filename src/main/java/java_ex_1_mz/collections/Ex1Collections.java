package java_ex_1_mz.collections;

public class Ex1Collections {

    //1. Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
    //a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
    //b. Wyświetl długość tablicy
    //c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
    //d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
    //zapisz go ponownie w tablicy.
    //e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.

    int[] numbers = new int[10];

    public void addNumbers() {
        System.out.println("Zad. 1a+1b Dodano do tablicy " + numbers.length + " elementów.");
        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 1;
    }

    public void tableLength() {
        System.out.println("Zad. 1c Długość talbicy to: " + numbers.length + ".");
    }

    public void printTable() {
        System.out.print("Utworzona tablica: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public void modifiedTable() {
        for (int i = 0; i < numbers.length; i++) {
            //    numbers[i] = (i + 1) * 2;
            numbers[i] = numbers[i] * 2;
        }


    }
}
