package package5;

public class AbstractDemo {

    public static void main(String args[]) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rect = new Rectangle();
        rect.draw();
        rect.resize();
    }

}
