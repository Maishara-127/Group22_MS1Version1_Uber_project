package com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;

import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.MarketingExecutive;
import com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass.RatingFeedback;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;

public class TrackRatingAndFeedBackController {
    @FXML
    private TableView<RatingFeedback> tableView;
    @FXML
    private TableColumn<RatingFeedback, Integer> ratingCol;
    @FXML
    private TableColumn<RatingFeedback, String> userCol;
    @FXML
    private TableColumn<RatingFeedback, String> categoryCol;
    @FXML
    private TableColumn<RatingFeedback, String> feedbackCol;
    @FXML
    private TextField filterTextField;
    @FXML
    private Label statusLabel;

    ArrayList<RatingFeedback> feedbackList = new ArrayList<>();
    MarketingExecutive marketingExecutive = new MarketingExecutive();

    @FXML
    public void initialize() {
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        userCol.setCellValueFactory(new PropertyValueFactory<>("userId"));
        feedbackCol.setCellValueFactory(new PropertyValueFactory<>("feedback"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));

        feedbackList = marketingExecutive.trackRatingFeedback();
        tableView.getItems().addAll(feedbackList);
    }

    private String getFeedbackCategory(int rating) {
        if (rating >= 1 && rating <= 3) {
            return "Good";
        } else if (rating >= 4 && rating <= 5) {
            return "Excellent";
        }
        return "Invalid Rating";
    }

    @FXML
    public void filterFeedBackButtonOnAction(ActionEvent actionEvent) {
        String filterText = filterTextField.getText();
        ArrayList<RatingFeedback> filteredList = new ArrayList<>();

        for (RatingFeedback feedback : feedbackList) {
            String feedbackCategory = getFeedbackCategory(feedback.getRating());
            if (!filterText.isEmpty() && feedbackCategory.contains(filterText)) {
                filteredList.add(feedback);
            }
        }

        tableView.getItems().clear();
        tableView.getItems().addAll(filteredList);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/group22_uber_2312262_2321374_2330201_2310256/marketingExecutivePageView.fxml"));
            Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Navigation Error");
            alert.setHeaderText("Unable to load the Marketing Executive page.");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}
