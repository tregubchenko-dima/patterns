package patterns.visitor;

public class FirstTimeVisitor implements Visitor{

    @Override
    public void visit(City city) {
        System.out.println("Visiting the city!");
    }

    @Override
    public void visit(Park park) {
        System.out.println("Visiting the park!");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("Visiting the museum!");
    }
}
