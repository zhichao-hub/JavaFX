package sample2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root= FXMLLoader.load(new URL("file:src/sample2/sample.fxml"));
        Parent root=FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
