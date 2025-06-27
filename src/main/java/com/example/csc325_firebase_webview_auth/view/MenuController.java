package com.example.csc325_firebase_webview_auth.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class MenuController {

    @FXML
    private void goToData(ActionEvent event) {
        try {
            App.setRoot("/files/AccessFBView.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goToWeb(ActionEvent event) {
        try {
            App.setRoot("/files/WebContainer.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void logout(ActionEvent event) {
        try {
            App.setRoot("/views/login-view.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}