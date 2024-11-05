package package2;

import package1.EnergyDrink;

public class EnergyDrinkUpdate {

    public static void main(String args[]){
        EnergyDrink e= new EnergyDrink("Red", 12);
        System.out.println(e.getQuantity());
        System.out.println(e.getColor());
    }
}
