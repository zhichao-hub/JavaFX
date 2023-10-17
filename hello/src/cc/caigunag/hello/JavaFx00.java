package cc.caigunag.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFx00 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();

        Button button1 = new Button("Button 1");
        AnchorPane.setTopAnchor(button1, 10.0);
        AnchorPane.setLeftAnchor(button1, 10.0);

        Button button2 = new Button("Button 2");
        AnchorPane.setTopAnchor(button2, 10.0);
        AnchorPane.setRightAnchor(button2, 10.0);

        anchorPane.getChildren().addAll(button1, button2);

        Scene scene = new Scene(anchorPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("AnchorPane Example");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
