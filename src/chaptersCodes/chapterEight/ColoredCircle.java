package chaptersCodes.chapterEight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ColoredCircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle c = new Circle(200, 200, 200);
        c.setFill(Color.AQUA);
        c.setStrokeWidth(5);
        pane.getChildren().add(c);

        Ellipse e1 = new Ellipse(100, 100, 50, 25);
        e1.setFill(Color.BLACK);
        pane.getChildren().add(e1);

        Ellipse e2 = new Ellipse(300, 100, 50, 25);
        e1.setFill(Color.BLACK);
        pane.getChildren().add(e2);

        Polygon p = new Polygon(200,180,220,220,180,220);
        p.setFill(Color.BLACK);
        pane.getChildren().add(p);

        Arc a = new Arc(200,200,140,140,-45,-90);
        a.setFill(Color.BLACK);
        pane.getChildren().add(a);

        Scene s1 = new Scene(pane, 400, 400);
        primaryStage.setTitle("Hacker");
        primaryStage.setScene(s1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
