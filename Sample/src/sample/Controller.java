package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    @FXML
   Button btn;
    @FXML
    public void reaction(){
        System.out.println("点击按钮");
        System.out.println(btn);
    }
    public void initialize(){//必须带public
        btn.setOnAction(e->{
            System.out.println("initialize");
        });
    }
}
