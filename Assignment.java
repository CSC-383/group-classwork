package assignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Assignment extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label nameLabel = new Label("Name");
        TextField nameText = new TextField();

        Text idLabel = new Text("Id");
        TextField idText = new TextField();

        Text deptLabel = new Text("Department");
        TextField deptText = new TextField();
        Button btn = new Button("Submit");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(10);
        grid.add(nameLabel, 0, 0);
        grid.add(nameText, 1, 0);
        grid.add(idLabel, 0, 1);
        grid.add(idText, 1, 1);
        grid.add(deptLabel, 0, 2);
        grid.add(deptText, 1, 2);
        grid.add(btn,1,3);

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setTitle("Scene-1");
        primaryStage.setScene(scene);
        
        primaryStage.show();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                showAnotherWindow();

            }

            
        });

    }

    public void showAnotherWindow() {
        Stage stage =new Stage();
        Label cLabel = new Label("CGPA:");
        TextField cText = new TextField();

        Text cNameLabel = new Text("Course Name:");
        TextField cNameText = new TextField();

        Text cCreditLabel = new Text("Completed Credits:");
        TextField cCreditText = new TextField();
        Button btn = new Button("Submit");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(10);
        grid.add(cLabel, 0, 0);
        grid.add(cText, 1, 0);
        grid.add(cNameLabel, 0, 1);
        grid.add(cNameText, 1, 1);
        grid.add(cCreditLabel, 0, 2);
        grid.add(cCreditText, 1, 2);
        grid.add(btn,1,3);

        Scene scene = new Scene(grid, 400, 400);
         stage.setTitle("Scene-2");
        stage.setScene(scene);
        stage.show();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               showAnotherWindow1();
            }
        });

    }
    public void showAnotherWindow1() {
        Stage stage =new Stage();
        Label aLabel = new Label("Address");
        TextField aText = new TextField();

        Text ageLabel =   new Text("Age");
        TextField ageText = new TextField();

        Text bGLabel = new Text("Blood Group");
        TextField bGText = new TextField();
        Button btn = new Button("Submit");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(10);
        grid.add(aLabel, 0, 0);
        grid.add(aText, 1, 0);
        grid.add(ageLabel, 0, 1);
        grid.add(ageText, 1, 1);
        grid.add(bGLabel, 0, 2);
        grid.add(bGText, 1, 2);
        grid.add(btn,1,3);

        Scene scene = new Scene(grid, 400, 400);
         stage.setTitle("Scene-3");

        stage.setScene(scene);
        stage.show();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("you click third window button");
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
