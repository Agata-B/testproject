package java_ex_3_SDA;

public class Vet {

    public void sayHello (Cat nameCat){
        System.out.println("Witaj " + nameCat.getName() + " !");
    }

    public void sayHello (Dog nameDog){
        System.out.println("Witaj " + nameDog.getName() + " !");
    }

    public void sayHello (AnimalsSound animal){
        System.out.println("Witaj " + animal.getName() + " !");

    }
}
