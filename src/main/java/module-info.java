module com.example.csvsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csvsystem to javafx.fxml;
    exports com.example.csvsystem;
}