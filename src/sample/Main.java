package sample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Main extends Application {
private parent content(){
    HBox root = new HBox();
    root.setsize(600 ,500);
    return parent;
}
private class questionpane extends VBox{
    private Text text = new Text();
    private List<Button> buttons = new ArrayList<>();
    public questionpane(){
    super(20);
        HBox hBox = new HBox();
        for (int i = 0; i < 4; i++) {
            Button knapp = new Button();
            knapp.setPrefWidth(120);

            buttons.add(knapp);
            hBox.getChildren().add(knapp);
        }
    getChildren().addAll(text, hBox);
    }

    public void setquestion(question question) {
    text.setText(question.name);
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
        primaryStage.setScene(new Scene(parent()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
