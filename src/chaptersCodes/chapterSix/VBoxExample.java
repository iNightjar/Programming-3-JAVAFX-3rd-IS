package chaptersCodes.chapterSix;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class VBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20));
        Button btn1 = new Button("hacker");
        Button btn2 = new Button("iNightjar");
        pane.getChildren().add(btn1);
        pane.getChildren().add(btn2);
        Scene scene = new Scene(pane);
        stage.setTitle("Vbox Buttons");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
