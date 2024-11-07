/*
* File: App.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-11-07
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/


package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoadingScene.fxml"));
            Parent root = fxmlLoader.load();
            Scene loadingScene = new Scene(root);

            primaryStage.setScene(loadingScene);
            primaryStage.show();

            LoadingScene controller = fxmlLoader.getController();
            controller.initialize(primaryStage);

        } catch (IOException e) {
            System.err.println("Error loading loading scene");
            System.out.println(e);
        }
    }

    @SuppressWarnings("unused")
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}