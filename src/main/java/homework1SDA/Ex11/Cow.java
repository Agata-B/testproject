package homework1SDA.Ex11;

public class Cow implements Animal {

    private String sound;

    @Override
    public String makeSound() {
        sound = "Muuu muuu";
        return sound;
    }
}
