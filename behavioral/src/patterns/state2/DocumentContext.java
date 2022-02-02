package patterns.state2;

public class DocumentContext {

    private DocumentState documentState;

    public DocumentState getDocumentState() {
        return documentState;
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public void nextDocumentStatus(){
        documentState.nextDocumentState(this);
    }

    public String getDocumentStatus(){
        return documentState.getStatusName();
    }
}
