package patterns.state2;

public class DocumentProcess implements DocumentState{

    @Override
    public String getStatusName() {
        return DocStatus.PROCESS.name();
    }

    @Override
    public void nextDocumentState(DocumentContext context) {
        context.setDocumentState(new DocumentSend());
    }
}
