module com.example.group22_uber_2312262_2321374_2330201_2310256 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.xml;

    opens com.example.group22_uber_2312262_2321374_2330201_2310256 to javafx.fxml;
    exports com.example.group22_uber_2312262_2321374_2330201_2310256;
    exports com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass;
    opens com.example.group22_uber_2312262_2321374_2330201_2310256.ControllerClass to javafx.fxml;
    exports com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass;
    opens com.example.group22_uber_2312262_2321374_2330201_2310256.ModelClass to javafx.fxml;
}
