package cc.caigunag.cai.settings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TestColor extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label =new Label("你好，世界");
        label.setFont(Font.font("华文琥珀", FontWeight.BOLD,30));
        Circle circle=new Circle();
        circle.setLayoutX(250);
        circle.setLayoutY(250);
        circle.setRadius(50);
        circle.setFill(Color.web("#FFF4D1"));
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(10);
        AnchorPane pane =new AnchorPane(circle);
        pane.getChildren().add(label);
        primaryStage.setScene(new Scene(pane,500,500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
