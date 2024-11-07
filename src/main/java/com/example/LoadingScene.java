/*
* File: LoadingScene.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-11-07
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/

package com.example;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoadingScene {

    private Stage stage;

    public void initialize(Stage primaryStage) {
        this.stage = primaryStage;

        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> loadMainScene());
        delay.play();
    }

    private void loadMainScene() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainScene.fxml"));
            Parent root = fxmlLoader.load();
            Scene mainScene = new Scene(root);

            stage.setScene(mainScene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Error loading main scene");
            System.out.println(e);
        }
    }
}

