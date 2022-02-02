package patterns.state2;

public class State2Test {

    public static void main(String[] args){
        DocumentContext context = new DocumentContext();
        context.setDocumentState(new DocumentNew());
        System.out.println(context.getDocumentStatus());

        context.nextDocumentStatus();
        System.out.println(context.getDocumentStatus());

        context.nextDocumentStatus();
        System.out.println(context.getDocumentStatus());
    }
}
