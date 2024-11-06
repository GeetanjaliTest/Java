package package6;

public class InterfaceDemo {

    public static void main(String args[]){
        MountainBike mb= new MountainBike(10,10,20);

        System.out.println("Gear is:"+ mb.getGear());
        System.out.println("Gear is:"+ mb.getSpeed());
        System.out.println("Gear is:"+ mb.getSeatHeight());

        mb.applyBrake(1);
        System.out.println("Gear is:"+ mb.getSpeed());

        mb.speedUp(10);
        System.out.println("Gear is:"+ mb.getSpeed());

    }
}
