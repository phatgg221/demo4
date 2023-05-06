package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    ArrayList<String> link= new ArrayList<>();
    ImageView imageView= new ImageView();
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane pane= new BorderPane();
        HBox pane1= new HBox();
        pane1.setAlignment(Pos.BOTTOM_LEFT);
        TextField textField= new TextField();
        textField.setMaxWidth(200);
        Button button= new Button("Submit");
        button.setOnAction(actionEvent -> {textField.getText();
            System.out.println(textField.getText());
        link.add("file:"+textField.getText());
            ;for(int i=0; i< link.size();i++){
                 imageView = new ImageView(link.get(i));
                imageView.setPreserveRatio(true);
                imageView.setFitWidth(200);
                imageView.setFitHeight(100);
                pane.getChildren().add(imageView);
            }
        });




        pane.setCenter(textField);
        pane.setBottom(button);;
        pane.setTop(pane1);
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}