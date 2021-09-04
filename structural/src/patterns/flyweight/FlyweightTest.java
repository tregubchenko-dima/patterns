package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightTest {

    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape(ShapeType.CIRCLE));
        shapes.add(shapeFactory.getShape(ShapeType.SQUARE));
        shapes.add(shapeFactory.getShape(ShapeType.TRIANGLE));
        shapes.add(shapeFactory.getShape(ShapeType.CIRCLE));
        shapes.add(shapeFactory.getShape(ShapeType.SQUARE));
        shapes.add(shapeFactory.getShape(ShapeType.TRIANGLE));
        shapes.add(shapeFactory.getShape(ShapeType.CIRCLE));
        shapes.add(shapeFactory.getShape(ShapeType.SQUARE));
        shapes.add(shapeFactory.getShape(ShapeType.TRIANGLE));

        Random rand = new Random();
        shapes.forEach(shape -> shape.draw(rand.nextInt(100), rand.nextInt(100)));
    }
}
