package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LogInPageController {

    @FXML
    private TextField userIdTextField;

    @FXML
    private PasswordField passwordField;

    private final String marketingExecutiveID = "Admin123";
    private final String marketingExecutivePassword = "123";
    private final String systemAdminID = "Admin456";
    private final String systemAdminPassword = "456";
    @FXML
    private AnchorPane popUpAnchorPane;

    @FXML
    public void loginButtonOnAction(ActionEvent event) {
        String userId = userIdTextField.getText().trim();
        String password = passwordField.getText().trim();

        try {
            if (userId.equals(marketingExecutiveID) && password.equals(marketingExecutivePassword)) {
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/marketingExecutivePageView.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle("Marketing Executive Dashboard");
                stage.setScene(new Scene(root));
                stage.show();
            } else if (userId.equals(systemAdminID) && password.equals(systemAdminPassword)) {
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/systemAdministratorPageView.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle("System Administrator Dashboard");
                stage.setScene(new Scene(root));
                stage.show();
            } else {
                showAlert("Incorrect Credentials", "Incorrect user ID or password.");
            }
        } catch (Exception e) {
            showAlert("Login Error!",  e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.show();
    }
}
