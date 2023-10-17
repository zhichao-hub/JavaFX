package cc.caigunag.cai.event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class TestEvent extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label=new Label("hello world");
        label.setLayoutX(200);
        label.setLayoutY(200);
        Button btn=new Button("向上移动");
        btn.setLayoutX(200);
        btn.setLayoutY(250);
        btn.setOnAction(e->{
            label.setLayoutY(label.getLayoutY()-10);
        });
        AnchorPane pane =new AnchorPane();
        pane.getChildren().addAll(label,btn);
        Scene scene=new Scene(pane,500,500);
        scene.setOnKeyPressed(e->{
            KeyCode keyCode=e.getCode();
            System.out.println(keyCode);
            if(keyCode.equals(KeyCode.UP)){
                label.setLayoutY(label.getLayoutY()-10);
            }
            if(keyCode.equals(KeyCode.DOWN)){
                label.setLayoutY(label.getLayoutY()+10);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
