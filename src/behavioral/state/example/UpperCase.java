package behavioral.state.example;

import java.util.Locale;

public class UpperCase implements WritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toUpperCase(Locale.ROOT));
    }
}
