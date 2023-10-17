package cc.caigunag.cai.event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class TestDrag extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane pane =new AnchorPane();
        Scene scene=new Scene(pane,500,500);
        TextField textField=new TextField();
        textField.setLayoutX(200);
        textField.setLayoutY(200);
        textField.setPrefWidth(100);
        textField.setOnDragOver(e->{
            e.acceptTransferModes(TransferMode.ANY);
        });
        textField.setOnDragDropped(e->{
            Dragboard dragBoard=e.getDragboard();
            if(dragBoard.hasFiles()){
                String path=dragBoard.getFiles().get(0).getAbsolutePath();
                textField.setText(path);
            }
        });
        pane.getChildren().add(textField);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
