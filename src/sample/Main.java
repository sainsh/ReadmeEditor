package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.PrintWriter;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        File readMe = new File("README.md");
        if(readMe.exists()) {

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 500, 400));
            primaryStage.show();
        }
        else{
            PrintWriter writer = new PrintWriter(readMe);
            writer.close();
            System.exit(0);
        }
    }


    public static void main(String[] args) {


        launch(args);
    }
}
