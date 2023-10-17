package cc.caigunag.cai.property;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestBind extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle=new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        AnchorPane pane=new AnchorPane(circle);
        Scene scene=new Scene(pane,500,500);
        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));
        circle.centerXProperty().addListener(((observable, oldValue, newValue) -> {
            System.out.println("圆的x坐标改变"+oldValue+"-->"+newValue);
        }));
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
