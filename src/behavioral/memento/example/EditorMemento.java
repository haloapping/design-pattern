package behavioral.memento.example;

public class EditorMemento {
    protected String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}