package chaptersCodes.chapterEight;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane {
    static Circle circle = new Circle(50);
    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }
    public static void enLarge(){
        circle.setRadius(circle.getRadius()+ 10);
    }
    public static void shrinking(){
        circle.setRadius(circle.getRadius() > 10 ? circle.getRadius() - 10 : circle.getRadius());
    }
}
