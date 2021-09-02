package patterns.bridge;

public class BridgeTest {

    public static void main(String[] args){
        Shape triangle = new Triangle(new BlueColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
