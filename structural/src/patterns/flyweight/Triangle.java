package patterns.flyweight;

public class Triangle extends Shape{

    public Triangle(){
        color = "blue";
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " triangle: " + x + ", " + y);
    }
}
