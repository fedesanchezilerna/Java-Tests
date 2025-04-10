package poo.polimorfismoYabstraccion;

public class Ninja extends Role {
    public Ninja(double posX, double posY) {
        super(posX, posY);
    }
    public void move() {
        setPosX(getPosX() + 5);
    }
    public void jump() {
        setPosY(getPosY() + 5);
    }
}
