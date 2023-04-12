module com.example.practiceproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practiceproject to javafx.fxml;
    exports com.example.practiceproject;
}