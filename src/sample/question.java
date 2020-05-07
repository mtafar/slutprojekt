package sample;



import java.util.Arrays;
import java.util.List;

abstract class question {




    public abstract String getCorrectAnswer();
    abstract class Question{
        private final List<String> answers;
        private String name;


        public Question(String name, String... answers){
            this.name = name;
            this.answers = Arrays.asList(answers);
        }
        public String getCorrectAnswer(){
            return answers.get(0);
        }
    }

}
