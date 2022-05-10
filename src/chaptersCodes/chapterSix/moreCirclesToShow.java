package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class moreCirclesToShow extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(50 ,50, 160, 100);
            rectangle.setRotate(30 * i);
            rectangle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            rectangle.setArcWidth(15);
            rectangle.setArcHeight(15);
            pane.getChildren().add(rectangle);
        }
        Scene s1 = new Scene(pane);
        primaryStage.setTitle("Rectangle");
        primaryStage.setScene(s1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
