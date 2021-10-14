module com.example.fatjardemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fatjardemo to javafx.fxml;
    exports com.example.fatjardemo;
}