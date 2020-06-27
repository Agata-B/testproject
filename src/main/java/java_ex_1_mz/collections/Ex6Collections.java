package java_ex_1_mz.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Ex6Collections {

    //6. Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
    //a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
    //b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
    //z zakresu <1,100> i dodaj je do kolejki.
    //c. Wyświetl kolejno liczby występujące w kolejce.

    public void printRandomQueue() {
        Queue<Integer> randomQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jaka ilość liczba ma zostać wylosowana.");
        int numbers = scanner.nextInt();
        Random random = new Random();
        for (int i = 1; i <= numbers; i++) {
            randomQueue.add(random.nextInt(100)+1); // +1 bo przedział był od 0 do 99 a my chcemy do 100
        }
        System.out.println(randomQueue);
    }
}
