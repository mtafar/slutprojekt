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
    private void nextquestion(){
            qpane.setquestion(new question("which animal is the fastest in the world", "cheetah", "rabbit", "lion", "hyena"));
}


private class questionpane extends VBox{
    private Text text = new Text();
    private List<Button> buttons = new ArrayList<>();
    private question current;
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

private class question{
    private String name;
    private List<String> answers;

    public question(String name, String... answers){
    this.name = name;
    this.answers = Arrays.asList(answers);
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
