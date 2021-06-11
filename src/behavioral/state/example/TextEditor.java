package behavioral.state.example;

public class TextEditor {
    protected WritingState writingState;

    public TextEditor(WritingState writingState) {
        this.writingState = writingState;
    }

    public void setState(WritingState writingState) {
        this.writingState = writingState;
    }

    public void type(String words) {
        this.writingState.write(words);
    }
}
