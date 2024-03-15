package com.example.inclassjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bianca Cervantes", 12345));
        studentList.add(new Student("Milo Lee", 6789));
        VBox vb = new VBox();
        for (Student s : studentList){
            vb.getChildren().add(getStudent(s));
        }
        BorderPane bp = new BorderPane();
        bp.setCenter(vb);

        Scene scene = new Scene(bp, 350, 230, Color.LIGHTYELLOW);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private VBox getStudent(Student s){
        VBox student = new VBox();
        student.getChildren().add(new Text("Name : "+s.name));
        student.getChildren().add(new Text("Name : "+s.id));
        student.setBackground(new Background(new BackgroundFill(Color.HONEYDEW, new CornerRadii(10), new Insets(10))));
        student.setPadding(new Insets(10));
        student.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED,new CornerRadii(10),new BorderWidths(10))));
        student.setStyle("--fx-background-color: yellow;");
        return student;
    }

     public static class Student {
        private String name;
        private int id;

         public Student(String name, int id) {
             this.name = name;
             this.id = id;
         }

         public int getId() {
             return id;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public void setId(int id) {
             this.id = id;
         }
     }
    public static void main(String[] args) {
        launch();
    }
}