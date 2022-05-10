package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;

// drawing with piriority
public class lineDrawingExample extends Application {
    @Override
    public void start (Stage primaryStage) {
        Pane pane = new Pane();
//        Line line1 = new Line();
//        line1.setStartX(100);
//        line1.setStartY(100);
//        line1.setEndX(200);
//        line1.setEndY(200);
//        Line line2 = new Line();
//        line2.setStartX(200);
//        line2.setStartY(100);
//        line2.setEndX(100);
//        line2.setEndY(200);
        Line line1 = new Line();
        Line line2 = new Line();
        line1.setStartX(100);
        line1.setStartY(100);
        line1.endXProperty().bind(pane.widthProperty().subtract(100));
        line1.endYProperty().bind(pane.heightProperty().subtract(100));
        line1.endYProperty().bind(pane.heightProperty().subtract(100));
        line2.startXProperty().bind(pane.widthProperty().subtract(100));
        line2.setStartY(100);
        line2.setEndX(100);
        line2.endYProperty().bind(pane.heightProperty().subtract(100));
        line1.setStrokeWidth(5);
        line2.setStrokeWidth(5);
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("lines by a Hacker");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
