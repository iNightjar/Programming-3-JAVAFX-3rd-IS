package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class flowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage){
        FlowPane pane = new FlowPane(Orientation.HORIZONTAL, 20 ,15);
        pane.setAlignment(Pos.CENTER_RIGHT);
        pane.setPadding(new Insets(20));
        Circle c1 = new Circle(50);
        c1.setFill(Color.YELLOWGREEN);
        Circle c2 = new Circle(50);
        c2.setFill(Color.CRIMSON);
        pane.getChildren().add(c1);
        pane.getChildren().add(c2);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("hello hacker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
