package sample;

import java.util.Arrays;
import java.util.List;

abstract class question {
    static question questions;
    private class Question{
        private String name;
        private List<String> answers;

        public Question(String name, String... answers){
            this.name = name;
            this.answers = Arrays.asList(answers);
        }
        public String getCorrectAnswer(){
            return answers.get(0);
        }
    }
}
