package poo.herencia;

public class Car extends Vehicle {
    private byte numSeats;
    private String model;

    public Car(String license, String type, byte numSeats, String model) {
        super(license, type);
        this.numSeats = numSeats;
        this.model = model;
    }

    @Override
    public double volume() {
        return numSeats * super.volume();
    }

    @Override
    public String toString() {
        return "Car [numSeats=" + numSeats + ", model=" + model + ", toString()=" +
               super.toString() + "]";
    }
}
