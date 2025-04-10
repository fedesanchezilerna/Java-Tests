package poo.herencia;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("A113", "Rayo", (byte) 12, "MCQUEEN");

        System.out.println(car1.volume());
        System.out.println(car1);
    }
}
