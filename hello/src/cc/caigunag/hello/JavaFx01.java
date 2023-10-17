package cc.caigunag.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFx01 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("测试JavaFX");
        //布局
        HBox hBox=new HBox();
        //控件
        //Button button=new Button("登录");
        Label label=new Label("这是一个标签");
        label.setTextFill(Color.BLUE);
        TextField tf=new TextField();
        String userInput=tf.getText();
        tf.setText("新的文本内容");
        tf.textProperty().addListener((observable,oldValue,newValue)->{
            System.out.println("文本变化前："+oldValue);
            System.out.println("文本变化后："+newValue);
        });
        tf.setPromptText("请输入文本");

        hBox.getChildren().add(label);//将控件添加到布局中
        hBox.getChildren().add(tf);//将控件添加到布局中
        //将布局添加到场景
        Scene scene=new Scene(hBox,400,400);
        //将场景添加到舞台中
        stage.setScene(scene);
        //设置舞台位置
        stage.setX(400);
        stage.setY(480);
        stage.show();
    }

    public static void main(String[] args) {
        JavaFx01.launch();
    }
}
