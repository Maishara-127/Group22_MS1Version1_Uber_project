package com.example.group22_uber_2312262_2321374_2330201_2310256.MaisharaControllers;

import com.example.group22_uber_2312262_2321374_2330201_2310256.MaisharaModelClasses.Project;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ProjectsController
{
    @javafx.fxml.FXML
    private ComboBox<String> ProjectCreationStatusComboBox;
    @javafx.fxml.FXML
    private TextField projectCreationGoalTextField;
    @javafx.fxml.FXML
    private ComboBox<String> ProjectCreationKeyMetricComboBox;
    @javafx.fxml.FXML
    private TextField ProjectCreationMemberIDsTextField;
    @javafx.fxml.FXML
    private Label ProjectCreationResultLabel;
    @javafx.fxml.FXML
    private DatePicker ProjectCreationDeadlineDatePicker;

    private ArrayList<Project> projectsArrayList;
    private FileInputStream projectsFile;
    private ObjectInputStream projectFileObjectInputStream;

    @javafx.fxml.FXML
    public void initialize() {
        if () {
            try {
                projectsFile = new FileInputStream("projects.bin");
                projectFileObjectInputStream = new ObjectInputStream(projectsFile);

                projectsArrayList = (ArrayList<Project>) projectFileObjectInputStream.readObject();


                projectFileObjectInputStream.close();
            } catch (Exception e) {
                // If file doesn't exist yet or something goes wrong
                System.out.println("Could not load projects: " + e.getMessage());
            }
        }

    }

    @javafx.fxml.FXML
    public void chatsOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateNewProjectOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void servicesOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void homeOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void operationalPoliciesOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void projectsOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportsAndAnalysisOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void businessForecastingOnActionButton(ActionEvent actionEvent) {
    }
}