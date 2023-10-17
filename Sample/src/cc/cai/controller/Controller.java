package cc.cai.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle circle;
    public void circleLocationBind(Scene scene){
        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));
    }
}
