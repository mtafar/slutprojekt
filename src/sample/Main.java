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
qpane nextquestion = new qpane() {
    @Override
    public void qpane() {

    }
};




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
