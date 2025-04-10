package poo.polimorfismoYabstraccion;

public class Test {
    public static void main(String[] args) {
        //Role Role = new Role();  //ERROR
        Role soldier = new Soldier(2, 2);
        soldier.move();
        soldier.jump();

        Role ninja = new Ninja(2, 2);
        ninja.move();
        ninja.jump();
    }
}
