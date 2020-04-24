package sample;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
public class Main extends Application {
private parent content(){
    HBox root = new HBox();
    root.setsize(600 ,500);
    return parent;
}
private class question{
    private String name;
    private List<String> answers;

    public question(String name, String... answers){
        
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
