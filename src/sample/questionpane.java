package sample;


import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

class questionpane extends Node {
    @Override
    public Node getStyleableNode() {
        return null;
    }

    public String getCorrectAnswer() {
        return null;
    }

    abstract static class questionpane extends VBox {
        private Text text = new Text();
        private List<Button> buttons = new ArrayList<>();
        private question current;


        protected abstract void nextquestion();
        static question questions;
    }




}
