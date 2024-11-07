/*
* File: MainController.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-11-07
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/


package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TextField areafield;

    @FXML
    private TextField aside;

    @FXML
    private TextField bside;

    @FXML
    private TextField cside;

    @FXML
    private TextField dside;

    @FXML
    @SuppressWarnings("unused")
    void onCalcBtn(ActionEvent event) {
        try {
            calculate();
        } catch (Exception e) {
            areafield.setText("Error");
            System.out.println(e);
        }
    }

    private void calculate() {

        Double a = Double.valueOf(aside.getText());
        Double b = Double.valueOf(bside.getText());
        Double c = Double.valueOf(cside.getText());
        Double d = Double.valueOf(dside.getText());
        Double elsoresz = a+c;
        Double masodikresz = 4 * (a-c);
        Double osztas = elsoresz/masodikresz;
        Double azahosszucucc = (a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d);
        Double csinaldmagad = Math.sqrt(azahosszucucc);
        Double result = osztas*csinaldmagad;

        areafield.setText(String.valueOf(result));
        System.out.println(result);
    }

    @FXML
    @SuppressWarnings("unused")
    void onExitBtn(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    @SuppressWarnings("unused")
    void onUwUBtn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("uwuScene.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("UwU Scene");
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to open uwuScene.fxml");
            System.err.println(e);
        }
    }

}
