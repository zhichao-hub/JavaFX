package cc.caigunag.cai;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Optional;

public class TestStageEvent extends Application {
    Node node;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn=new Button("log in");
        btn.setOnAction(e->{
            Stage s=new Stage();
            s.setScene(new Scene( new Label("退出"),200,200));
            s.setTitle("wait");
            s.show();
        });
        BorderPane pane=new BorderPane();
        //pane.getChildren().add(btn);
        pane.setCenter(btn);
        //Platform.setImplicitExit(false);
        primaryStage.setOnCloseRequest(e->{

            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("退出程序");
            alert.setHeaderText(null);
            alert.setContentText("您是否退出程序？");
            e.consume();
            Optional<ButtonType> result=alert.showAndWait();
            if(result.get()==ButtonType.OK){
                Platform.exit();
                //primaryStage.close();
            }
        });
        Scene scene=new Scene(pane,300,300);
        //scene.setCursor(Cursor.OPEN_HAND);//手型cursor
        scene.setCursor(Cursor.WAIT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
