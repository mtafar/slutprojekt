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


    private questionpane qpane = new questionpane();

    private HBox content(){
    HBox root = new HBox();
    root.setPrefSize(600 ,500);

    root.getChildren().add(qpane);
    return root;
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
