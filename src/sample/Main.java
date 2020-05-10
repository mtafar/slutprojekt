package sample;
import java.util.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main extends Application {

    private static final Font font = Font.font(18);

    private questionpane qpane = new questionpane();


    private HBox content(){
        HBox root = new HBox();
        root.setPrefSize(600 ,500);
        qpane.setquestion(new question("how old is trump", "73", "55", "5", "64"));
        root.getChildren().add(qpane);
        return root;
    }
    private class questionpane extends VBox{
        private Text text = new Text();
        private List<Button> buttons = new ArrayList<>();
        private question current;
        int run = 0;
        private void nextquestion(){

            if (run == 0){
                question a = new question("what is the fastest animal on land", "cheetah", "lion", "tiger", "rabbit");
                qpane.setquestion(a);
                current  = a;
                run = 1;
            }

            else if (run == 1){
                question a = new question("what car is from the middle east", "Lykan hypersport", "Ferrari", "Volvo", "BMW");
                qpane.setquestion(a);
                current  = a;
                run = 1;
            }
            else if (run == 2){
                question a = new question("which youtuber is famous from doing fifa to boxing", "KSI", "Logan Paul", "W2S", "Pewdiepie");
                qpane.setquestion(a);
                current  = a;
                run = 2;
            }
            else if (run == 3){
                question a = new question("which country is Adolf Hitler from", "Austria", "Germany", "Poland", "Belgium");
                qpane.setquestion(a);
                current  = a;
                run = 3;
            }
            else if (run == 4){
                question a = new question("what does HTML stand for", "Hyper Text Markup Language", "Hitler Took Many Lives", "Hungry Towers Many Lies", "Hassan threw Many Lights");
                qpane.setquestion(a);
                current  = a;
                run = 4;
            }
            else if (run == 5){
                question a = new question("which country has the highest population", "China", "Japan", "Russia", "USA");
                qpane.setquestion(a);
                current  = a;
                run = 5;
            }
            else if (run == 6){
                question a = new question("what does CSS stand for", "Cascading Style Sheets", "Corona Sweden Style", "Colombia Sell Stuff", "Call Sony Stark");
                qpane.setquestion(a);
                current  = a;
                run = 6;
            }
            else if (run == 7){
                question a = new question("who is the richest man on earth", "Jeff Bezos", "Bill gates", "Elon Musk", "Mark Zuckerberg");
                qpane.setquestion(a);
                current  = a;
                run = 7;
            }
            else if (run == 8){
                question a = new question("Who is the best soccer player", "Cristiano Ronaldo", "Lionel Messi", "Serigo Ramos", "Neymar");
                qpane.setquestion(a);
                current  = a;
                run = 8;
            }

        }
        public questionpane(){
            super(20);
            text.setFont(font);
            HBox hBox = new HBox();
            for (int i = 0; i < 4; i++) {
                Button knapp = new Button();
                knapp.setFont(font);
                knapp.setPrefWidth(120);
                knapp.setOnAction(event ->{
                    if (knapp.getText().equals(current.getCorrectAnswer())) {
                        System.out.println("correct");
                        nextquestion();

                    }
                    else {
                        System.out.println("incorrect");

                    }
                });
                buttons.add(knapp);
                hBox.getChildren().add(knapp);
            }
            setAlignment(Pos.TOP_CENTER);
            getChildren().addAll(text, hBox);
        }

        public void setquestion(question question) {
            text.setText(question.name);
            current = question;
            Collections.shuffle(buttons);
            for (int i = 0; i < 4; i++) {
                buttons.get(i).setText(question.answers.get(i));
            }
        }
    }
        question question = new question();
    private class question{
        private String name;
        private List<String> answers;



        public question(String name, String... answers) {
            this.name = name;
            this.answers = Arrays.asList(answers);
        }

        public question() {

        }

        public String getCorrectAnswer(){
            return answers.get(0);
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(content()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}