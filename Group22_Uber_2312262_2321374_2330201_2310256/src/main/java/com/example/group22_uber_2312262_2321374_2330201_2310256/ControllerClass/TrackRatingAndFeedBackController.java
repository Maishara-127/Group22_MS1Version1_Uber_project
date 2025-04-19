package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.RatingFeedback;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class TrackRatingAndFeedBackController
{
    @javafx.fxml.FXML
    private TextField filterTextField;
    @javafx.fxml.FXML
    private TableColumn<RatingFeedback, Integer> ratingCol;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<RatingFeedback, String> userCol;
    @javafx.fxml.FXML
    private TableColumn<RatingFeedback, String> feedBackCol;
    @javafx.fxml.FXML
    private TableView<RatingFeedback> tableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterFeedBackButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/marketingExecutivePageView.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Failed to load page: " + e.getMessage());
            alert.showAndWait();
        }
    }
}