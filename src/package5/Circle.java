package package5;

public class Circle extends GraphicObject{
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing circle");
    }
}
