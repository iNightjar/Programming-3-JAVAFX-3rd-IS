package chaptersCodes.chapterTen;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class connectingJavaFxWithMYSQDB extends Application {
    private Statement statement;
    private final TextField forStudentId = new TextField();
    private final Label status  = new Label("Grade will be displayed here");
    @Override
    public void start(Stage primaryStage) throws Exception {
        initializeDB();
        Button btn = new Button("Show Grades");
        HBox hBox = new HBox(5);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().addAll(new Label("ID: "), forStudentId, btn);
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox, status);
        forStudentId.setPrefColumnCount(6 );
        btn.setOnAction(e -> showGrades());
        Scene scene = new Scene(vBox, 420, 80);
        primaryStage.setTitle("hacker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private void initializeDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver "  );
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cs","root", "");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();

        }
    }
    private void showGrades(){
        int SID = Integer.parseInt(forStudentId.getText())  ;
        try{
            String queryString = "select Grade From Student where ID = " + SID;
            ResultSet resultSet = statement.executeQuery(queryString);
            if (resultSet.next()){
                int grade = resultSet.getInt(1);
                status.setText("the Grade is : "+ grade );
            }
            else{
                status.setText("Not Found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
