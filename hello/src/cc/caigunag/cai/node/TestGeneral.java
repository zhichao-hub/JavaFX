package cc.caigunag.cai.node;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TestGeneral extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label=new Label("Hello world");
        label.setLayoutX(200);
        label.setLayoutY(200);
        label.setStyle("-fx-background-color:red; -fx-border-color:blue ;-fx-border-width:3px");
        label.setPrefHeight(50);
        label.setPrefWidth(200);
        label.setAlignment(Pos.CENTER);
        //label.setVisible(false);不显示
        label.setOpacity(5.0);
        AnchorPane pane=new AnchorPane(label);
        primaryStage.setScene(new Scene(pane,500,500));
        label.getParent().setStyle("-fx-background-color:green");
        //System.out.println(label.getId());

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
