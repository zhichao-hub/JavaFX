package cc.caigunag.hello;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX03 extends Application {
    private Parent createContent(){
        return new StackPane(new Text("Hello World"));
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setScene(new Scene(createContent(),300,300));
//        primaryStage.show();
        primaryStage.setTitle("Parent Example");

        VBox vbox = new VBox(); // 创建一个垂直布局容器
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        button1.setOnAction((e)->{
            button1.setTranslateX(button1.getTranslateX()+20);
        });
        button2.setOnAction((e)->{
            button2.setTranslateY(button2.getTranslateY()+20);
        });
        vbox.getChildren().addAll(button1, button2); // 将按钮添加到布局容器中

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
