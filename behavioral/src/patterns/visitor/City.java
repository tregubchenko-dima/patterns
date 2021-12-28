package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class City implements Element{

    List<Element> places = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City is accepting visitor");
        visitor.visit(this);

        for(Element place : places){
            place.accept(visitor);
        }
    }

    public City() {
        places.add(new Park());
        places.add(new Museum());
    }
}
