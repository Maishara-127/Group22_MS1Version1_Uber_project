package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
public class SystemAdministratorPageController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackupImportantFilesButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/backUpImportantFilesView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("BackUp Important Files");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void ManageUserAccessButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/manageUserAccessView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Manage User Access");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void CheckAppVersionAndUpdateButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/checkAppVersionAndUpdateView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Check App Version and Update");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void CheckSystemUptimeButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/checkSystemUptimeView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Check System Uptime");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void OptimizePaymentProccesingButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/optimizePaymentProcessingView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Optimize Payment Process");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void CheckSecurityLogsButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/checkSecurityLogsView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("checkSecurityLogsView");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/adjustMarketingBudgetView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Adjust Marketing Budget");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void MaintainCustomerAndDriverSupportSystemButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/adjustMarketingBudgetView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Adjust Marketing Budget");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void ReduceAppDataConsumptionButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/adjustMarketingBudgetView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Adjust Marketing Budget");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    private void showError(String errorMessage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Failed to load page " + " Error: " + errorMessage);
        alert.showAndWait();
    }
}