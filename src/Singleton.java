public class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton showInstance(){
        if(instance == null){
            instance= new Singleton();
        }
        return instance;
    }

    public void display(){
        System.out.println("Hello");
    }

    public static void main(String args[]){
        Singleton instance = Singleton.showInstance();
        instance.display();
    }
}