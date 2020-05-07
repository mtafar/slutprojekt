package sample;

import java.util.Collections;

abstract class qpane {
   public abstract void qpane();

    public static void setquestion(qpanequestion question) {
        text.setText(question.name);
        current = question;
        Collections.shuffle(buttons);
        for (int i = 0; i < 4; i++) {
            buttons.get(i).setText(question.answers.get(i));
        }
    }

}
