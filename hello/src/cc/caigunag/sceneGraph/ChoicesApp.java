package cc.caigunag.sceneGraph;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.util.StringConverter;

import java.util.ArrayList;
import java.util.List;

public class ChoicesApp extends Application {
    private final ChoiceBox<Pair<String,String>> assetClass=new ChoiceBox<>();
    private void initChoice(){
        List<Pair<String,String>> ar=new ArrayList<>();
        ar.add( new Pair("Equipment", "20000"));
        ar.add( new Pair("Furniture", "21000"));
        ar.add( new Pair("Investment", "22000"));
        assetClass.setValue(new Pair<>("1","1"));
        assetClass.getItems().addAll(ar);
        assetClass.setConverter(new StringConverter<Pair<String, String>>() {
            @Override
            public String toString(Pair<String, String> object) {
                return object.getKey();
            }

            @Override
            public Pair<String, String> fromString(String string) {
                return null;
            }
        });
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label=new Label("Assert Class:");
        assetClass.setPrefWidth(200);
        initChoice();
        Button saveButton=new Button("save");
        HBox hbox=new HBox(label,assetClass,saveButton);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(40));
        Scene scene=new Scene(hbox);
        saveButton.setOnAction(e->{
            System.out.println("Saving "+assetClass.getValue());
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChoicesApp");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
