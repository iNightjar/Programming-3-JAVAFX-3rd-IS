package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class GradPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(20));
        Label l1 = new Label("User Name: ");
        Label l2 = new Label("Password: ");
        Label l3 = new Label();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Button b1 = new Button("Login");
//        pane.add(l1, 0, 0);
//        pane.add(tf1, 1, 0);
//        pane.add(l2, 0, 1);
//        pane.add(tf2, 1, 1);
//        pane.add(b1, 1, 2);
        pane.addRow(0,l1,tf1);
        pane.addRow(1,l2,tf2);
        pane.addRow(2,l3,b1);
        pane.setHalignment(b1, HPos.CENTER);
        Scene s1 = new Scene(pane);
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(s1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
