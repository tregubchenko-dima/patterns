package patterns.flyweight;

public class Circle extends Shape{

    public Circle(){
        color = "green";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle: " + x + ", " + y);
    }
}
