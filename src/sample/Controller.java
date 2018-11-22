package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Controller {

    @FXML
    TextArea textArea;

    File readMe = new File("README.md");


    public void onLoadBTNClick(ActionEvent actionEvent) {

        textArea.clear();

        try {
            Scanner input = new Scanner(readMe);
            while (input.hasNext()){
                textArea.appendText(input.next());

            }

        }catch (FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        }

    }

    public void onSaveBTNClick(ActionEvent actionEvent) {

        try{
            PrintWriter output = new PrintWriter(readMe);

            output.println(textArea.getText());
            output.close();
            textArea.clear();


        }catch (FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        }
    }
}
