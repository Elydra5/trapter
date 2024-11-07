/*
* File: UwUController.java
* Author: Klíber Regő Benedek
* Copyright: 2024, Klíber Regő Benedek
* Group: Szoft II/I/N
* Date: 2024-11-07
* Github: https://github.com/Elydra5/
* Licenc: GNU GPL
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class UwUController {

    @FXML
    @SuppressWarnings("unused")
    void onBwack(ActionEvent event) {
        ((javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow()).close();
    }

}
