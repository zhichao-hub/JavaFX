package minigame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {
    private static final double WIDTH=800,HEIGHT=600;
    private static Canvas canvas=new Canvas(WIDTH,HEIGHT);
    private GraphicsContext gc= canvas.getGraphicsContext2D();
    private Image background=new Image("file:resources/image/bg.jpg");
    private Image plane=new Image("file:resources/image/plane.png");
    private double x=400,y=300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        update();
        Pane pane=new Pane(canvas);

        Scene scene=new Scene(pane);
        scene.setOnKeyPressed(e->{
            KeyCode keyCode=e.getCode();
            switch (keyCode){
                case UP:
                    y-=5;
                    break;
                case DOWN:
                    y+=5;
                    break;
                case RIGHT:
                    x+=5;
                    break;
                case LEFT:
                    x-=5;
                    break;
            }

        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void paint(){
        gc.drawImage(background,0,0);
        gc.drawImage(plane,x,y);
    }
    //刷新
    private void update(){
        AnimationTimer animationTimer=new AnimationTimer() {
            @Override
            public void handle(long now) {
                paint();
            }
        };
        animationTimer.start();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
