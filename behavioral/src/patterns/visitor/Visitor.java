package patterns.visitor;

public interface Visitor {

    void visit(City city);
    void visit(Park park);
    void visit(Museum museum);
}
