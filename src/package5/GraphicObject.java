package package5;

//Abstract class cannot be instantiated but they can be subclassed.
//Abstract method is declared without implementation

public abstract class GraphicObject {

    int x,y;

    void moveTo(int newX,int newY){
        System.out.println("Move to:" + newX + " Move to:"+ newY);
    }

    abstract void draw();
    abstract void resize();
}
