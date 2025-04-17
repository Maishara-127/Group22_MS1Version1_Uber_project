module com.example.group22_uber_2312262_2321374_2330201_2310256 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group22_uber_2312262_2321374_2330201_2310256 to javafx.fxml;
    exports com.example.group22_uber_2312262_2321374_2330201_2310256;
    exports com.example.group22_uber_2312262_2321374_2330201_2310256.MaisharaModelClasses;
    opens com.example.group22_uber_2312262_2321374_2330201_2310256.MaisharaModelClasses to javafx.fxml;
    exports com.example.group22_uber_2312262_2321374_2330201_2310256.MaisharaControllers;
    opens com.example.group22_uber_2312262_2321374_2330201_2310256.MaisharaControllers to javafx.fxml;
}