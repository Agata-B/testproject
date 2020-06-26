package java_ex_1_mz.OOP;

public class Engine {

    int capacity;
    int horsePower;
    int fuelConsumption;

    public Engine(int capacity, int horsePower, int fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
