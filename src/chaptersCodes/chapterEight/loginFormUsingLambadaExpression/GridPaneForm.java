package chaptersCodes.chapterEight.loginFormUsingLambadaExpression;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneForm extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(20));
        Label firstLabel = new Label("User Name: ");
        Label secondLabel = new Label("Password: ");
        TextField forUserName = new TextField();
        TextField forPassword = new TextField();
        Button btn =new Button("Login");
        pane.add(firstLabel, 0 , 0);
        pane.add(forUserName, 1 , 0);
        pane.add(secondLabel, 0 , 1);
        pane.add(forPassword, 1, 1);
        pane.add(btn, 1 , 2);
        pane.setHalignment(btn, HPos.CENTER);

        forUserName.setOnAction(e -> System.out.println("Enter User Name here"));
        forPassword.setOnAction(e -> System.out.println("Enter password here"));
        btn.setOnAction(event -> System.out.println("The User Nma is: " + forUserName.getText()
        + " and Password is: " + forPassword.getText()));
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Hacker Hacker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
