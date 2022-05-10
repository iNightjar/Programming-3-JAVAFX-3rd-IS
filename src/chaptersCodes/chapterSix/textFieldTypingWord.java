package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class textFieldTypingWord extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
            Pane pane = new Pane();
            Text text = new Text("Ezzat Abo Neka");
            Text text2 = new Text("Karem Afify Abo Neka");
            text.setX(100);
            text.setY(100);
            text.setUnderline(true);
            text.setFill(Color.CADETBLUE);
            text.setStroke(Color.BLACK);
            text.setStrokeWidth(5);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 60));
            text2.setX(300);
            text2.setY(300);
            text2.setUnderline(true);
            text2.setFill(Color.CADETBLUE);
            text2.setStroke(Color.BLACK);
            text2.setStrokeWidth(5);
            text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 60));
            pane.getChildren().add(text);
            pane.getChildren().add(text2);
            Scene s1 = new Scene(pane);
            primaryStage.setTitle("Texting");
            primaryStage.setScene(s1);
            primaryStage.show();
        }
    public static void main(String[] args) {
        launch(args);
    }
}
