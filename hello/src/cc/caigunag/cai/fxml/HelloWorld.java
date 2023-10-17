package cc.caigunag.cai.fxml;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class HelloWorld extends Application {

    public  Label label;

    public Button btn1;

    public Button btn2;
    @FXML
    public void buttonClicked(Event e){
        label.setText("登录成功！");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(new URL("file:resources/fxml/helloWorld.fxml"));
        VBox vbox=loader.load();
        vbox.setSpacing(30);
        label=(Label)loader.getNamespace().get("label");
        btn1=(Button) loader.getNamespace().get("btn1");
        btn1.setOnAction(e->{
            label.setText("Button clicked");
        });
//        btn1.setOnAction(e->{
//            label.setText("Button1 clicked!");
//        });
        Scene scene=new Scene(vbox,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        /*System.setProperty("javafx.runtime.path", "D:/JavaFX/javafx-sdk-17.0.8/lib");
        System.setProperty("fx.javascript.enabled", "true");*/
        launch(args);
    }
}
