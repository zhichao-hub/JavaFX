package cc.caigunag.cai;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TestScene extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1=new Button("hello world");
        btn1.setLayoutX(200);
        btn1.setLayoutY(200);
        AnchorPane pane =new AnchorPane(btn1);
        Scene scene=new Scene(pane,500,500);
        scene.setCursor(new ImageCursor(new Image("file:image/car.jfif")));
        Label label=new Label("你好 javaFX");
        label.setLayoutX(200);
        label.setLayoutY(200);
        Button btn2=new Button("返回原场景");
        btn2.setLayoutX(200);
        btn2.setLayoutY(250);
        AnchorPane pane2=new AnchorPane(btn2);
        pane2.getChildren().add(label);
        Scene scene2=new Scene(pane2,500,500);
        scene2.setCursor(new ImageCursor(new Image("file:image/icon.jpg")));
        btn1.setOnAction(e->{
            primaryStage.setScene(scene2);
        });
        btn2.setOnAction(e->{
            primaryStage.setScene(scene);
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello");
        primaryStage.getIcons().add(new Image("file:image/icon.jpg"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
