package cc.caigunag.cai.canvas;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hello extends Application {
    private int boardSize=15;
    private int cellSize=40;
    private  double WIDTH=boardSize*cellSize,HEIGHT=boardSize*cellSize;
    private Canvas canvas=new Canvas(WIDTH,HEIGHT);
    private double x;
    private double y;
    private GraphicsContext gc= canvas.getGraphicsContext2D();
    private WritableImage image=null;
    public void drawBoard(){
        for(int row=0;row<boardSize;row++){
            for(int col=0;col<boardSize;col++){
                gc.strokeRect(col*cellSize,row*cellSize,cellSize,cellSize);
            }
        }
    }
    public void piece(){
        int col=(int)(x+cellSize/2)/cellSize;
        int row=(int)(y+cellSize/2)/cellSize;
        gc.setFill(Color.BLACK);
        int radius=10;
        gc.fillOval(cellSize*col-radius,cellSize*row-radius,2*radius,2*radius);
    }
    public void drawLine(){
        canvas.setOnMouseDragged(e->{
            double x2=e.getX();
            double y2=e.getY();
            gc.strokeLine(x,y,x2,y2);
            x=x2;
            y=y2;
        });
    }
    public void drawRect(){
        canvas.setOnMouseDragged(e->{
            double startX=x;
            double startY=y;
            double endX=e.getX();
            double endY=e.getY();
            double width=Math.abs(endX-startX);
            double height=Math.abs(endY-startY);
            startX=endX>startX? startX:endX;
            startY=endY>startY?startY:endY;
            gc.clearRect(0,0,WIDTH,HEIGHT);
            gc.drawImage(image,0,0,WIDTH,HEIGHT);
            gc.strokeRect(startX,startY,width,height);
        });
    }
    public void saveImage(){
        WritableImage writableImage=canvas.snapshot(null,null);
        BufferedImage bufferedImage= SwingFXUtils.fromFXImage(writableImage,null);
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("保存canvas图片");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PNG",".PNG"));
        File file=fileChooser.showOpenDialog(canvas.getScene().getWindow());
        if(file!=null){
            try {
                ImageIO.write(bufferedImage,"PNG",file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        canvas.setLayoutX(0);
        canvas.setLayoutY(0);
        canvas.setOnMouseClicked(e->{
            x=e.getX();
            y=e.getY();
            //piece();
        });

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        gc.setFill(Color.WHITE);
        drawRect();
        //drawLine();
        //drawBoard();
        canvas.setOnMouseReleased(e->{
            image= canvas.snapshot(null,null);
        });
        Pane pane=new Pane(canvas);
        primaryStage.setScene(new Scene(pane));

        saveImage();

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
