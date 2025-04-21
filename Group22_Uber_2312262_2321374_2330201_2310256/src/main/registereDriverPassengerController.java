package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.RegisteredUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class registereDriverPassengerController {

    @FXML
    private Button showPassengersButton;

    @FXML
    private Button showDriversButton;

    @FXML
    private ListView<RegisteredUser> registedUserListView;

    @FXML
    private Button backButton;

    SystemAdministrator systemAdmin = new SystemAdministrator("Admin", 123, "systemAdmin", "admin@uber.com");

    @FXML
    public void showPassengersButtonOnAction(ActionEvent actionEvent) {
        registedUserListView.getItems().clear();
        registedUserListView.getItems().addAll(systemAdmin.displayRegisteredDeriversAndPassengers("Passenger"));
    }

    @FXML
    public void showDriversButtonOnAction(ActionEvent actionEvent) {
        registedUserListView.getItems().clear();
        registedUserListView.getItems().addAll(systemAdmin.displayRegisteredDeriversAndPassengers("Driver"));
    }

    @FXML
    public void BackButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/systemAdministratorPageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("System Administrator");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Failed to load page: " + e.getMessage()).showAndWait();
        }
    }
}
