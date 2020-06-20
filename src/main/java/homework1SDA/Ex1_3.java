package homework1SDA;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Ex1_3 {
    /*
    1. Wypisz poniższy kawałek tabliczki mnożenia:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    Zmodyfikuj powyższe żeby wyświetlało ten kawałek tabliczki dla liczby zadanej w
    parametrze.
    */
    public static void multiplicationTable(int number) {
        for (int i = 1; i < 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    /*2. Dla danej liczby sprawdź, czy jest ona liczbą pierwszą.
     */

    public static boolean itIsAPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy podana liczba jest licza pierwszą ? Podaj wrtość liczby.");
        int givenNumber = scanner.nextInt();

        if (givenNumber < 2) {
            return false;
        }
        for (int i = 2; i < givenNumber; i++) {
            if (givenNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    3. Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y
     */
    public static int add() {
        int x = 5;
        int y = 10;
        int sum = 0;
        int tabLenght = (y - x) + 1;
        int[] fromXtoY = new int[tabLenght];
        fromXtoY[0] = x;
        fromXtoY[(tabLenght - 1)] = y;

        if (y < x) {
            for (int i = 0; i<tabLenght; i++) {
                sum += fromXtoY[i];
            }
        }
        return sum;
    }




    public static void main(String[] args) {
    }
}