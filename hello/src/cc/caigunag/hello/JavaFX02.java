package cc.caigunag.hello;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JavaFX02 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button but=new Button("hide the window");
        but.setOnAction((e)->{
            stage.hide();
        });
        HBox hBox=new HBox();
        hBox.getChildren().add(but);
        Scene scene=new Scene(hBox, 400,400);
//        stage.setWidth(300);
//        stage.setHeight(200);
        stage.setScene(scene);
        //导航栏的风格
        //stage.initStyle(StageStyle.DECORATED);
        //stage.initStyle(StageStyle.UNDECORATED);没有关闭的x了
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.initStyle(StageStyle.UNIFIED);
        //stage.initStyle(StageStyle.UTILITY);
        //stage.setFullScreen(true);
        //JavaFX Stage可以发出一些您可以监听的事件，
        //close request,Hiding,Hidden,Showing,shown
        /*stage.setOnCloseRequest((e)->{
            System.out.println("close stage");
        });
        stage.setOnShowing((e)->{
            System.out.println("舞台showing");
        });*/
        //OnHidden实践监听器
//        stage.setOnHidden((e)->{
//            System.out.println("舞台隐藏");
//        });
        //添加键盘，识别键盘
        stage.addEventHandler(KeyEvent.KEY_PRESSED,(e)->{
            System.out.println("被按下的键盘"+e.getCode());
        });

        //添加鼠标事件
        stage.addEventHandler(MouseEvent.ANY,(e)->{
            System.out.println("鼠标操作"+e.getEventType().getName());
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
