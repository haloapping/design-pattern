package behavioral.memento.example;

public class Editor {
    protected String content = "";

    public void type(String words) {
        this.content = this.content + " " + words;
    }

    public String getContent() {
        return this.content;
    }

    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento editorMemento) {
        this.content = editorMemento.getContent();
    }
}
