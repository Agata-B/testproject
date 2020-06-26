package java_ex_3_SDA;

public class Dog implements AnimalsSound{

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String makeSound() {
        return dogName + " How how";
    }

    @Override
    public String getName() {
        return dogName;
    }

}
