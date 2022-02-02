package patterns.state2;

public interface DocumentState {
    String getStatusName();
    void nextDocumentState(DocumentContext context);
}
