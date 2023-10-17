package cc.caigunag.cai.property;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 */
public class TestProperty {
    public static void main(String[] args) {
        DoubleProperty value=new SimpleDoubleProperty(10.0);
        value.addListener((observable,oldValue,newValue)->{
            System.out.println("Value changed: "+oldValue+"--->"+newValue);
        });
        value.setValue(33.3);
    }
}
