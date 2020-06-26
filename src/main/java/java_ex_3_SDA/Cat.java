package java_ex_3_SDA;

import java.util.ArrayList;
import java.util.List;

public class Cat implements AnimalsSound, Movable {
    private String catName;
    private int numberEatMouse;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public String makeSound() {
        return catName + " Miau miau";
    }

    @Override
    public String getName() {
        return catName;
    }

    public void eatMouse() {
        numberEatMouse++;
        System.out.println("Zjedłem " + numberEatMouse + " myszy.");
    }

    @Override
    public String move() {
        return "Idę.";
    }

}
