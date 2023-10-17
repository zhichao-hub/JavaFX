package cc.caigunag.cai.property;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestProperty02 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        Scene scene=new Scene(pane,1024,800);
        ReadOnlyDoubleProperty width=pane.widthProperty();
        width.addListener(((observable, oldValue, newValue) -> {
            System.out.println("Pane width change"+oldValue+"-->"+newValue);
        }));
        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
