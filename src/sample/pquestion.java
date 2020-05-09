package sample;

import java.util.Arrays;
import java.util.List;

public class pquestion extends question {
    private final List<String> answers;
    private String name;

    public pquestion(String name, String... answers){
        this.name = name;
        this.answers = Arrays.asList(answers);
    }
}
