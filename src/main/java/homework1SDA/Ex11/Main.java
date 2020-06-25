package homework1SDA.Ex11;

public class Main {
    public static void main(String[] args) {


        //Zdefiniuj interface Animal z metodą makeSound. Zaimplementuj ten interejsw klasach Cat,
        //Dog and Cow. Utwórz tablicę obiektów zwierząt różnych klas, wypisz wydawane przez nich
        //odgłosy

        Cat kot = new Cat();
        Dog pies = new Dog();
        Cow krowa = new Cow();


        Animal[] zwierzęta = {kot, pies, krowa};
        for (Animal animals : zwierzęta) {
            System.out.println(animals.makeSound());


        }
    }
}
