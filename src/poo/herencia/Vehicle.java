package poo.herencia;

public class Vehicle {
    private String license;
    private String type;

    public Vehicle(String license, String type) {
        this. license = license;
        this. type = type;
    }

    public double volume() {
        if (type .equals("CAR")) return 1.0;
        else return 10.0;
    }
    @Override
    public String toString() {
        return "Vehicle [license=" + license + ", type=" +
               type +  "]";
    }
}