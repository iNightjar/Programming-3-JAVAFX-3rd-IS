// package chaptersCodes;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.StackPane;
// import javafx.stage.Stage;

// public class Main extends Application {
//     public static void main(String[] args) {
//         launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {
//         primaryStage.setTitle("Hello Hacker");
//         Button btn = new Button();
//         btn.setText("Hello Hacker");
//         btn.setOnAction(new EventHandler<>() {

//             @Override
//             public void handle(ActionEvent event) {
//                 System.out.println("Hello iNightjar!");
//             }
//         });

//         StackPane root = new StackPane();
//         root.getChildren().add(btn);
//         primaryStage.setScene(new Scene(root, 300, 250));
//         primaryStage.show();
//     }
// }
