package patterns.state2;

public class DocumentSend implements DocumentState{

    @Override
    public String getStatusName() {
        return DocStatus.SEND.name();
    }

    @Override
    public void nextDocumentState(DocumentContext context) {
        System.out.println("Document has been sent");
    }
}
