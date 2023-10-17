package cc.caigunag.transformations;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestTranslate extends Application {
    private Parent createContent(){
        Rectangle rec=new Rectangle(100,50, Color.BLUE);
        transform(rec);
        return new Pane(rec);
    }
    private void transform(Rectangle rec){
        rec.setTranslateX(100);
        rec.setTranslateY(100);
        rec.setScaleX(1.5);
        rec.setScaleY(1.5);
        rec.setRotate(90);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent(),300,300,Color.GRAY));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
