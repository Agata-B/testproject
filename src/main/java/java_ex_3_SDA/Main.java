package java_ex_3_SDA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //1. Napisz klasę Cat, która w konstruktorze przyjmować będzie imię kota. Klasa powinna
        //posiadać metodę makeSound, która wypisywać będzie imię kota oraz wydawany przez niego
        //dźwięk.
        //2. Utwórz tablicę kotów, dodaj do niej parę utworzonych obiektów i dla wszystkich wywołaj
        //metodę makeSound.
        //3. Do klasy Cat dodaj metodę eatMouse, która będzie zliczała zjedzone przez kota myszy i
        //wypisywała komunikat: „Zjadłem X myszy”.
        //4. Napisz klasę Dog, która w konstruktorze przyjmować będzie imię psa. Klasa powinna
        //posiadać metodę makeSound, która wypisywać będzie imię psa oraz wydawany przez niego
        //dźwięk.
        //5. Utwórz tablicę zwierząt, dodaj do niej parę utworzonych obiektów typu Cat oraz Dog i dla
        //wszystkich wywołaj metodę makeSound.
        //6. Napisz interfejs Movable, który będzie zawierał metodę move. Napisz klasę Car
        //implementującą interfejs Movable – w metodzie move ma wypisać komunikat „jadę”.
        //7. Zmodyfikuj klasę Cat tak, żeby implementowała interfejs Movable – w metodzie move ma
        //wypisać komunikat „idę”.
        //8. Utwórz klasę Vet, która będzie miała metodę sayHello przyjmującą jako parametr obiekt
        //klasy Cat i wypisującą powitanie dla tego kota, np. „Witaj Mruczek”.
        //9. W klasie Vet napisz metodę sayHello przyjmującą jako parametr obiekt klasy Dog i
        //wypisującą powitanie dla tego psa, np. „Witaj Burek”.
        //10. Zamiast dwóch wersji metody sayHello napisz jedną, która będzie potrafiła przyjąć w
        //parametrze obiekty klas Cat oraz Dog.


        //11. Napisz klasy: Rectangle, Circle i Triangle. Każda z tych klas powinna posiadać odpowiednie
        //pola i konstruktor oraz metodę getArea - obliczającą pole:
        //1. Prostokąta – wysokość * szerokość
        //2. Koła – Pi * promień * promień
        //3. Trójkąta – ½ * wysokość * podstawa
        //12. Napisz metodę, która policzy łączne pole powierzchni paru utworzonych figur.
        //13. Mając podaną powierzchnię X, która może zostać pokryta przez farbę, napisz metodę, która
        //sprawdzi, czy daną ilością farby można zamalować wszystkie podane figury.

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Filemon");
        cats[1] = new Cat("Biofacy");
        cats[2] = new Cat("Garfild");
        for (Cat cat : cats) {
            System.out.println(cat.makeSound());
        }

        AnimalsSound[] animalsSounds = new AnimalsSound[4];
        animalsSounds[0] = new Dog("Reksio");
        animalsSounds[1] = new Cat("Puszek");
        animalsSounds[2] = new Cat("Kropka");
        animalsSounds[3] = new Dog("Azor");

        for (AnimalsSound animal : animalsSounds) {
            System.out.println(animal.makeSound());
        }


        Cat cat = new Cat("Kropka");
        Dog dog = new Dog("Azor");
        Vet vet = new Vet();
        vet.sayHello(cat);
        vet.sayHello(dog);
    }
}

