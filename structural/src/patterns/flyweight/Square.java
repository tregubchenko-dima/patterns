package patterns.flyweight;

public class Square extends Shape{

    public Square(){
        color = "orange";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " square: " + x + ", " + y);
    }
}
