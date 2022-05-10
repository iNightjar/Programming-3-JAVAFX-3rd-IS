package chaptersCodes.chapterEight;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.*;

public class buttonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Hello Hacker");

    }
}
