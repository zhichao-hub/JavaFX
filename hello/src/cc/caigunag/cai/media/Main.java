package cc.caigunag.cai.media;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //MediaView mediaView=new MediaView();
//        mediaView.setFitHeight(400);
//        mediaView.setFitWidth(400);
//        mediaView.setLayoutX(100);
//        mediaView.setLayoutY(100);
        Button btn1=new Button("play");
        Button btn2=new Button("stop");
        btn1.setLayoutY(500);
        btn1.setLayoutX(150);
        btn2.setLayoutY(500);
        btn2.setLayoutX(550);
        Pane pane=new Pane(btn1,btn2);
        Scene scene=new Scene(pane,800,600);
        primaryStage.setScene(scene);
//        mediaView.setOnDragDropped(e->{
//            System.out.println("触发操作");
//            Dragboard dragboard=e.getDragboard();
//            if(dragboard.hasFiles()){
//                File file=dragboard.getFiles().get(0);
//                System.out.println(file.toURI());
//                Media media=new Media(file.toURI().toString());
//                MediaPlayer mediaPlayer=new MediaPlayer(media);
//                mediaPlayer.setOnReady(()->{
//                    mediaPlayer.setAutoPlay(true);
//                    btn1.setOnAction(e1->{
//                        mediaPlayer.play();
//                    });
//                    btn2.setOnAction(e2->{
//                        mediaPlayer.stop();
//                    });
//                });
//            }
//        });


        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
