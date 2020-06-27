package java_ex_1_mz.OOP;

public class SportCar extends Car {

    private String radio;
    private String sound;

    public SportCar(String producer, String model, String color, int seatsNumber, Engine engine) {
        /*this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
        */

        //36 przypisuje konstruktor z klasy abstrakcyjnej
        super(producer, model, color, seatsNumber, engine);
        this.sound = "bruuummm";
    }

    public String makeSound (){
        return this.sound;
    }


    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
