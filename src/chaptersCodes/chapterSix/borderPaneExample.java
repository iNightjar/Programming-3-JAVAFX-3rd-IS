package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class borderPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20));
        Button btn1 = new Button("Top");
        Button btn2 = new Button("Right");
        Button btn4 = new Button("Buttom");
        Button btn3 = new Button("Left");
        Button btn5 = new Button("Center");
        pane.setTop(btn1);
        pane.setBottom(btn4);
        pane.setLeft(btn3);
        pane.setRight(btn2);
        pane.setCenter(btn5);
        pane.setAlignment(btn1, Pos.CENTER);
        pane.setAlignment(btn2, Pos.CENTER);
        pane.setAlignment(btn3, Pos.CENTER);
        pane.setAlignment(btn4, Pos.CENTER);
        pane.setAlignment(btn5, Pos.CENTER);
        Scene scene = new Scene(pane);
        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
