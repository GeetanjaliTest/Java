package package1;

public class EnergyDrink {

    String color;
    int quantity;

    public EnergyDrink(String color, int quantity){
        this.color= color;
        this.quantity= quantity;
    }

    public void setColor(String color){
        this.color= color;
    }

    public void setQuantity(int quantity){
        this.quantity= quantity;
    }

    public String getColor(){
        return color;
    }

    public int getQuantity(){
        return quantity;
    }

}
