package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<ShapeType, Shape> shapes = new HashMap<>();

    public Shape getShape(ShapeType shapeType){
        Shape shape = shapes.get(shapeType);

        if(shape == null){
            switch (shapeType){
                case CIRCLE:
                    shape = new Circle();
                    break;
                case TRIANGLE:
                    shape = new Triangle();
                    break;
                case SQUARE:
                    shape = new Square();
                    break;
            }
            shapes.put(shapeType, shape);
        }

        return shape;
    }
}
