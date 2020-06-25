package homework1SDA.Ex11;

public class Dog implements Animal {

    private String sound;

    @Override
    public String  makeSound() {
        sound = "How how";
        return sound;
    }
}
