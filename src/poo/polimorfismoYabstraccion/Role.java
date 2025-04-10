package poo.polimorfismoYabstraccion;

public abstract class Role {
    private double posX;
    private double posY;
    public Role(double posX, double posY) {
        super();
        this.posX = posX;
        this.posY = posY;
    }
    public abstract void move();

    public abstract void jump();

    public double getPosX() {
        return posX;
    }
    public void setPosX(double posX) {
        this.posX = posX;
    }
    public double getPosY() {
        return posY;
    }
    public void setPosY(double posY) {
        this.posY = posY;
    }
}