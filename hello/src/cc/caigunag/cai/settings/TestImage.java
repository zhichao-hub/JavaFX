package cc.caigunag.cai.settings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TestImage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane pane=new AnchorPane();
        ImageView imageView=new ImageView();
        Image image=new Image("file:image/icon.jpg");
        imageView.setImage(image);
        ImageView imageView1=new ImageView(new Image("file:image/car.jfif"));
        pane.getChildren().add(imageView);
        imageView1.setOpacity(0.5);
        pane.getChildren().add(imageView1);
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
