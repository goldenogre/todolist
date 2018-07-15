package com.goldenogre.todolist;

import com.goldenogre.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView todoListView;
    public void initialize(){
        TodoItem item1= new TodoItem("Mail birthday card", "Buy goodies", LocalDate.of(2018, Month.DECEMBER,22));
        TodoItem item2= new TodoItem("Workout", "Do the pushups", LocalDate.of(2018, Month.DECEMBER,22));
        TodoItem item3= new TodoItem("Food", "Buy food from walmart", LocalDate.of(2018, Month.DECEMBER,22));
        TodoItem item4= new TodoItem("Complete application", "todolist and other stuff", LocalDate.of(2017, Month.DECEMBER,22));
        TodoItem item5= new TodoItem("Mail birthday card", "Buy goodies", LocalDate.of(2018, Month.DECEMBER,22));

        todoItems= new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
}
