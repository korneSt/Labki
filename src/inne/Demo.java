package inne;

import java.util.List;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;

public class Demo {

    public static void main(String[] args) {

        // Use Java Collections to create the List.
        List<String> list = new ArrayList<String>();

        // Now add observability by wrapping it with ObservableList.
        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener((ListChangeListener) change -> {
            System.out.println("Detected a change! ");
        });

        // Changes to the observableList WILL be reported.
        // This line will print out "Detected a change!"
        observableList.add("item one");
        observableList.add("item two");
        // Changes to the underlying list will NOT be reported
        // Nothing will be printed as a result of the next line.
        //list.add("item two");

        System.out.println("Size observable list: " + observableList.size());
        System.out.println("Size list: " + list.size());
        System.out.println(list.get(0));

    }
}