package gobang;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int boardSize=15;//棋盘大小
        int cellSize=40;//每个格子大小
        Pane pane=new Pane();
        for(int row=0;row<boardSize;row++){
            for(int col=0;col<boardSize;col++){
                Rectangle cell=new Rectangle(cellSize,cellSize);
                cell.setFill(Color.BLACK);
                cell.setStroke(Color.WHITE);
                cell.setLayoutX(cellSize*col);
                cell.setLayoutY(cellSize*row);
                pane.getChildren().add(cell);
            }
        }
        pane.setOnMouseClicked(e->{
            double mouseX=e.getSceneX();
            double mouseY=e.getSceneY();
            int col=(int)(mouseX+cellSize/2)/cellSize;
            int row=(int)(mouseY+cellSize/2)/cellSize;
            Circle circle=new Circle();
            circle.setRadius(10);
            circle.setFill(Color.WHITE);
            circle.setCenterX(cellSize*col);
            circle.setCenterY(cellSize*row);
            System.out.println(row+":"+col);
            //pane.add(circle,col-1,row-1);
            pane.getChildren().add(circle);
        });
        Scene scene=new Scene(pane,cellSize*boardSize,cellSize*boardSize);
        primaryStage.setScene(scene);
        primaryStage.setTitle("五子棋");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
