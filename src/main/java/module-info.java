module com.example.webnasty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.webnasty to javafx.fxml;
    exports com.example.webnasty;
}