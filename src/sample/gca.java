package sample;


import java.util.List;

public class gca extends question {
    private final List<String> answers;

    public gca(List<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer(){

        return answers.get(0);
    }
}
