package sample2;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TableView<Person> table;

    @FXML
    private TableColumn<Person, String> name;

    @FXML
    private TableColumn<Person, Integer> age;

    @FXML
    private TableColumn<Person, Double> score;
    public void initialize(){
        ObservableList<Person>data= FXCollections.observableArrayList();
        name.setCellValueFactory(new PropertyValueFactory<Person,String>("name"));
        age.setCellValueFactory(new PropertyValueFactory<Person,Integer>("age"));
        score.setCellValueFactory(new PropertyValueFactory<Person,Double>("score"));
        data.add(new Person("张三",23,100));
        data.add(new Person("李四",23,100));
        data.add(new Person("王五",23,100));
        data.add(new Person("张三",23,100));
        System.out.println(data);
        table.setItems(data);
    }
}
