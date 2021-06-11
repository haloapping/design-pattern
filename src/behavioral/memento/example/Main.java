package behavioral.memento.example;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.type("This is the first sentence");
        editor.type("This is the second sentence");

        EditorMemento save = editor.save();

        editor.type("And this is third sentence");
        System.out.println(editor.getContent());

        editor.restore(save);
        System.out.println(editor.getContent());

        editor.type("I'm happy :)");
        System.out.println(editor.getContent());

        editor.restore(save);
        System.out.println(editor.getContent());
    }
}
