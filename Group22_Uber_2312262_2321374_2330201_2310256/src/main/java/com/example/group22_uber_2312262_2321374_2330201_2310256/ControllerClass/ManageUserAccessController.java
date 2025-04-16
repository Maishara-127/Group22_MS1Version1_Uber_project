package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManageUserAccessController {

    @FXML
    private TextField searchField;
    @FXML
    private Label nameLabel, emailLabel, statusLabel, idLabel;
    @FXML
    private ComboBox<String> roleComboBox;

    private User user;

    @FXML
    public void initialize() {
        roleComboBox.getItems().addAll("Passenger", "Driver", "Admin", "Marketing Executive");
        user = new User("Nujat", "123", "nujatehasnat@gmail.com", "Marketing Executive");
    }

    @FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
        String input = searchField.getText().trim();
        if (input.equals(user.getEmail()) || input.equals(user.getId())) {
            nameLabel.setText(user.getName());
            idLabel.setText(user.getId());
            emailLabel.setText(user.getEmail());
            roleComboBox.setValue(user.getRole());
            statusLabel.setText("");
        } else {
            nameLabel.setText("");
            idLabel.setText("");
            emailLabel.setText("");
            roleComboBox.setValue(null);
            statusLabel.setText("User not found.");
        }
    }

    @FXML
    public void changeAndSaveRoleButtonOnAction(ActionEvent actionEvent) {
        if (user == null) {
            statusLabel.setText("Please search and select a user first.");
            return;
        }

        String newRole = roleComboBox.getValue();
        if (newRole != null && !newRole.equals(user.getRole())) {
            user.setRole(newRole);
            statusLabel.setText("New role updated successfully.");

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Updated Role");
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
            File file = fileChooser.showSaveDialog(new Stage());
            if (file != null) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Name: " + user.getName() + "\n");
                    writer.write("ID: " + user.getId() + "\n");
                    writer.write("Email: " + user.getEmail() + "\n");
                    writer.write("Updated Role: " + user.getRole() + "\n");
                    statusLabel.setText("Role updated and saved to file.");
                } catch (IOException e) {
                    statusLabel.setText("Failed to save updated role.");
                    e.printStackTrace();
                }
            }
        } else {
            statusLabel.setText("Please select a new role different from the current one.");
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/systemAdministratorPageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("System Administrator");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Failed to load page " + " Error: " + e.getMessage());
            alert.showAndWait();
        }
    }
}
