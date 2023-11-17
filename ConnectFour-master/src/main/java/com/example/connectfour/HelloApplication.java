package com.example.connectfour;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

      //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.RED);

        Image icon = new Image("");
        stage.getIcons().add(icon);

        stage.setTitle("Connect Four 🥺");

        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}