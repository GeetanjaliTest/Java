package package6;

public class MountainBike implements Bicycle{
    private int gear;
    private int speed;
    private int seatHeight;

    public MountainBike(int gear, int speed,int seatHeight){
        this.gear=gear;
        this.speed= speed;
        this.seatHeight= seatHeight;
    }

    public int getGear(){
        return gear;
    }

    public int getSeatHeight(){
        return seatHeight;
    }

    public int getSpeed(){
        return speed;
    }

    @Override //overriding method from the base class Bicycle
    public void applyBrake(int decrement) {
        speed= speed - decrement;

    }

    @Override
    public void speedUp(int increment) {
        speed= speed + increment;
    }
}
