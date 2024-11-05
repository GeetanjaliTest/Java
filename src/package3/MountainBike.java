package package3;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight= seatHeight;
    }

    public void setHeight(int seatHeight){
        this.seatHeight= seatHeight;

    }

    public static void main(String args[]){
        MountainBike mb= new MountainBike(10,20,10);
        System.out.println("Gear :" +mb.gear + " Speed: "+ mb.speed
        + " Height: "+ mb.seatHeight);
        mb.speedUp(100);
        System.out.println("After applying spped up. New Speed is :" + mb.speed);
    }
}
