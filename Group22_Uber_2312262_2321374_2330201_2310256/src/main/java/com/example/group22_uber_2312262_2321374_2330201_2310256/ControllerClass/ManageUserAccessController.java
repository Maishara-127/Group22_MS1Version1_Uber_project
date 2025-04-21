package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.SystemAdministrator;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.UserInfo;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.DummyUserInfo;
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
import javafx.stage.Stage;

import java.io.*;


public class ManageUserAccessController implements Serializable {
    @FXML
    private TextField searchField;
    @FXML
    private Label nameLabel, emailLabel, statusLabel, idLabel;
    @FXML
    private ComboBox<String> roleComboBox;

    private UserInfo user;
    private UserInfo selectedUser;

    @FXML
    public void initialize() {
        roleComboBox.getItems().addAll("Passenger", "Driver", "Admin", "Marketing Executive");
    }

    @FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
        String input = searchField.getText();
        selectedUser = DummyUserInfo.getUserByIdOrEmail(input);

        if (selectedUser != null) {
            nameLabel.setText(selectedUser.getName());
            idLabel.setText(selectedUser.getId());
            emailLabel.setText(selectedUser.getEmail());
            roleComboBox.setValue(selectedUser.getRole());
            statusLabel.setText(" User found.");
        } else {
            nameLabel.setText("");
            idLabel.setText("");
            emailLabel.setText("");
            roleComboBox.setValue(null);
            statusLabel.setText(" User not found.");
        }
    }

    @FXML
    public void changeAndSaveRoleButtonOnAction(ActionEvent actionEvent) {

        try {
            if (selectedUser == null) {
                statusLabel.setText(" Please search for a user first.");
                return;
            }

            String newRole = roleComboBox.getValue();
            if (newRole == null || newRole.isEmpty()) {
                return;


            } else {
                SystemAdministrator systemAdmin = new SystemAdministrator("Arpy", 111, "arpy@uber.com", "Admin");
                systemAdmin.manageUserAccess(selectedUser, newRole);
                statusLabel.setText("Role Updated!");

            }

            File f = null;
            FileOutputStream fis = null;
            ObjectOutputStream oos = null;
            try {
                f = new File("updateRole.bin");
                fis = new FileOutputStream(f);
                oos = new ObjectOutputStream(fis);
                oos.writeObject(selectedUser);
                oos.close();
                fis.close();
                statusLabel.setText("Report saved!");
            } catch (Exception e) {
                statusLabel.setText("Error:" + e.getMessage());
            } finally {
                try {
                    if (oos != null) oos.close();
                    if (fis != null) fis.close();
                } catch (Exception e) {
                    statusLabel.setText("Error: " + e.getMessage());
                    System.out.println(e.getMessage());
                }
            }
        }catch(Exception e){
            statusLabel.setText("Error: " + e.getMessage());
            System.out.println(e.getMessage());

        }

    }





    @FXML
    public void backButtonOnAction (ActionEvent actionEvent){
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
