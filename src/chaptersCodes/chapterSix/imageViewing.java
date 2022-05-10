package chaptersCodes.chapterSix;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


// image viewing with imageView
public class imageViewing extends Application {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        InputStream stream = new FileInputStream("blackDoor.jpg");
        Image image = new Image(stream);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(imageView);
        Scene s1 = new Scene(stackPane);
        primaryStage.setTitle("Image");
        primaryStage.setScene(s1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
