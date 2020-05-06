package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class questionpane {
    abstract class questionpane extends VBox {
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

        protected abstract void nextquestion();

        public void setquestion(question question) {
            text.setText(question.name);
            current = question;
            Collections.shuffle(buttons);
            for (int i = 0; i < 4; i++) {
                buttons.get(i).setText(question.answers.get(i));
            }
        }
    }


}
