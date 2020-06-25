package homework1SDA.Ex11;

public class Cat  implements Animal {

    private String sound;

    @Override
    public String makeSound() {
        sound = "Miau miau";
        return sound;
    }
}