package cc.caigunag.cai.thread;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



/**
 * 多线程,不允许除主线程之外的其他线程去刷新UI
 */
public class MultiThread extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView imageView=new ImageView();
        imageView.setLayoutX(50);
        imageView.setLayoutY(0);
        Label label=new Label();
        label.setLayoutX(300);
        label.setLayoutY(350);
        Button btn=new Button("加载");
        btn.setLayoutX(200);
        btn.setLayoutY(200);
        btn.setOnAction(e->{
            new Thread(()->{
                String name="zhichao";
                Image image=new Image("https://bkimg.cdn.bcebos.com/pic/0823dd54564e925855c193869c82d158cdbf4ee4?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_auto",true);
                image.progressProperty().addListener((observable,oldValue,newValue)->{
                    int progress=(int)(double)newValue*100;
                    label.setText("图片加载了"+progress+"%");
                    System.out.println(Thread.currentThread().getName());

                });
               //不修改UI的话则正确，其他耗时才做可以多线程
                Platform.runLater(()->{

                    imageView.setImage(image);
                });
                //label.setText(name);
            }).start();
        });
        Pane pane=new Pane();
        pane.getChildren().add(btn);
        pane.getChildren().add(label);
        pane.getChildren().add(imageView);
        primaryStage.setScene(new Scene(pane,400,400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
