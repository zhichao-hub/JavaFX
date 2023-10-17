package cc.caigunag.hello;

import javafx.application.Application;
import javafx.stage.Stage;

//import javafx.application.Application;
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("这是我的第一个JavaFX项目");
        stage.setWidth(400);
        stage.setHeight(400);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
