package package3;

public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int gear, int speed){
        this.gear= gear;
        this.speed= speed;
    }

    public void setGear(int gear){
        this.gear= gear;
    }

    public void applyBrake(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }
}
