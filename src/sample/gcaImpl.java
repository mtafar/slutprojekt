package sample;

import java.util.List;

public class gcaImpl extends gca {

    private final List<String> answers;

    public gcaImpl(List<String> answers) {
        super(answers);
        this.answers = answers;
    }
}
