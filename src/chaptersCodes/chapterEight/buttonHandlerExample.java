package chaptersCodes.chapterEight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class buttonHandlerExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Button btn = new Button("Hello Hacker");
        buttonHandler btnhandler = new buttonHandler();
        btn.setOnAction(btnhandler);
        pane.getChildren().add(btn);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test Button Handling");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
