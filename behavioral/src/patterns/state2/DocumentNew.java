package patterns.state2;

public class DocumentNew implements DocumentState{

    @Override
    public String getStatusName() {
        return DocStatus.NEW.name();
    }

    @Override
    public void nextDocumentState(DocumentContext context) {
        context.setDocumentState(new DocumentProcess());
    }
}
