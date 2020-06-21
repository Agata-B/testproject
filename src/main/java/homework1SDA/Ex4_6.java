package homework1SDA;

import java.awt.print.Printable;

public class Ex4_6 {

    /*4. Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
Przykład: zadana tablica [12, 7, 19]
                   wynik [19, 7, 12]  */

    public static void invertedArray(int[] arrayOfValues) {
        if (arrayOfValues.length >= 3) {
            System.out.print("Podana tablica to :    ");
            arrayPrinter(arrayOfValues);
            int value = arrayOfValues[0];
            arrayOfValues[0] = arrayOfValues[2];
            arrayOfValues[2] = value;
            System.out.println();
            System.out.print("Odwrócona tablica to : ");
            arrayPrinter(arrayOfValues);
        } else {
            System.out.println("Error");
        }
    }

    public static void arrayPrinter(int[] array) {
        for (int value : array) {
            System.out.print("[" + value + "]");
        }
    }


    /*5. Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy*/

    public static void minMaxValue(int[] table) {
        int min = table[0];
        int max = table[0];
        for (int i = 0; i < table.length; i++) {
            if (min > table[i]) {
                min = table[i];
            }
            if (max < table[i]) {
                max = table[i];
            }
        }
        System.out.println("Wartość minimalna z tablicy to : " + min);
        System.out.println("Wartość maksymalna z tablicy to : " + max);

    }
/*6. Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
utwórz nową tablicę, do której przepisze tylko te ujemne liczby*/

    public static int[] counterMinusValue(int[] tab) {
        int counter = 0;
        for (int num : tab) {
            if (num < 0) counter++;
        }
        int[] minus = new int[counter];
        int sum = 0;
        for (int num : tab) {
            if (num < 0) {
                minus[sum] = num;
                sum++;
            }
        }
        System.out.println("Suma liczb ujemnych w tablicy: " + counter);
        System.out.print("Tablica wartości ujemnych z wcześnie utworzonej tablicy: ");
        return minus;
    }

    public static void main(String[] args) {

    }
}
