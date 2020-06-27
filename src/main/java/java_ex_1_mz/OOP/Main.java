package java_ex_1_mz.OOP;

public class Main {
    public static void main(String[] args) {
        //16. Utwórz klasę Person posiadającą pola name, surname, age.
        //17. Utwórz konstruktor bezparametrowy.
        //18. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia klasy
        //Person.
        //19. Dodaj metodę introduce wyświetlającą na konsoli imię oraz nazwisko osoby.
        //20. Utwórz klasę Address. Dodaj do klasy pola street, city, country, flatNo, homeNo.
        //21. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia klasy
        //Address (street, city, country, flatNo, homeNo)
        //22. Rozbuduj klasę Person tak aby przechowywała klasę Address.
        //23. Utwórz nowy konstruktor przyjmujący wszystkie możliwe parametry do ustawienia
        //klasy Person (name, surname, age oraz Address)
        //24. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Person
        //25. Utwórz metody umożliwiające ustawienie każdego parametry/pola klasy Address
        //26. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Person
        //27. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Address
        //28. Utwórz klasę Engine posiadającą pola capacity, horsePower, fuelConsumption..
        //29. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
        //Engine
        //30. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Engine
        //31. Utwórz metody umożliwiające ustawienie każdego parametry/pola klasy Engine
        //32. Utwórz klasę abstrakcyjną Car posiadającą pola producer, model, color,
        //seatsNumber oraz Engine.
        //33. Utwórz klasę SportCar dziedziczącą po klasie Car
        //34. Utwórz konstruktor bezparametrowy w klasie Car, który inicjalizuje pole seatsNumber
        //wartością 2.
        //35. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienie klasy
        //SportCar.
        //36. Zmodyfikuj utworzony konstruktor tak aby wywołał wieloparametrowy konstruktor
        //klasy Car.

        Person person = new Person("Olga", "Boś");
        person.introduce();
        System.out.println();
        Address address = new Address("Kolorowa", 8, 2, "Kielce", "Polska");
        Person person1 = new Person("Olga", "Boś", 35, address);
        person1.introduceFull();


        SportCar sportCar = new SportCar("Audi", "Q3", "Black", 5, new Engine(5, 500, 9));
        System.out.println(sportCar.toString());
        sportCar.setRadio("ESKA");
        System.out.println(sportCar.getRadio());
        System.out.println(sportCar.makeSound());
    }
}
