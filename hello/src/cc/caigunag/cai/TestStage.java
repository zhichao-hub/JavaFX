package cc.caigunag.cai;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class TestStage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1=new Button("窗口1");
        Button btn2=new Button("窗口2");
        btn1.setLayoutX(200);
        btn1.setLayoutY(200);
        btn2.setLayoutX(200);
        btn2.setLayoutY(250);
        AnchorPane pane=new AnchorPane();
        pane.getChildren().addAll(btn1,btn2);
        btn1.setOnAction(e->{
            Stage stage=new Stage();
            stage.setHeight(200);
            stage.setWidth(300);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            stage.show();
        });
        primaryStage.setScene(new Scene(pane,500,500));
        primaryStage.setTitle("Hello");
        primaryStage.getIcons().add(new Image("file:image/icon.jpg"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
