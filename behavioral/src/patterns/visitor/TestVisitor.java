package patterns.visitor;

public class TestVisitor {

    public static void main(String[] args){
        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(firstTimeVisitor);
    }
}
