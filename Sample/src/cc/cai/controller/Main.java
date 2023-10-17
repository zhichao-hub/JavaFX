package cc.cai.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(new URL("file:src/cc/cai/controller/demo.fxml"));
        Parent root=loader.load();
        Controller controller=loader.getController();
        Scene scene=new Scene(root);
        controller.circleLocationBind(scene);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
