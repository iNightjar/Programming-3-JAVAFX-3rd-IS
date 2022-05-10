package chaptersCodes.chapterEight.mouseHandlers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javax.naming.event.EventContext;

public class mouseHandlersChangingCircleColor extends Application {
    Circle circle = new Circle(50 ) ;
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BEIGE);
        circle.setStrokeWidth(4);
        pane.getChildren().add(circle);
        circle.setOnMousePressed(new mousePressHandler());
        circle.setOnMouseReleased(new mouseReleaseHandler());
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("hacker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    class mousePressHandler implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event){
            circle.setFill(Color.BLACK);
        }
    }
    class mouseReleaseHandler implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event){
            circle.setFill(Color.WHITE);
        }
    }
}
