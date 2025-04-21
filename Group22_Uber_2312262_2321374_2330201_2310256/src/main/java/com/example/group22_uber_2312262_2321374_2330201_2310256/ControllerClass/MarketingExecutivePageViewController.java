package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class MarketingExecutivePageViewController {

    @javafx.fxml.FXML
    private javafx.scene.control.Label buttonBackgroundLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void MonitorUserEngagementTrendButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/monitorUserEngagementTrendsView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Monitor User Engagement");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void createDiscountCodeButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/createDiscountCodeView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Create Discount Code");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void SendEmailCampaignButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/sendEmailCampaignView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Send Email Campaign");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void updateSocialMediaLinkOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/updateSocialMediaLinksView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Update Social Media Link");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void scheduleSocialMediaPost(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/scheduleAutomatedSocialMediaPostView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Schedule Automated Post");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError(e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void AdjustMarketingBudgetButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/adjustMarketingBudgetView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Adjust Marketing Budget");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError( e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void PromoteNewServiceButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/promoteNewServiceView.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Promote New Service");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError(e.getMessage());
        }
    }

    private void showError(String errorMessage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Failed to load page " + " Error: " + errorMessage);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/logInPageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Login Page");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError(e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void TrackRatingAndFeedback(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/trackRatingAndFeedBackView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Login Page");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            showError(e.getMessage());
        }
    }
}
