package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

abstract class frogapane {
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
}
