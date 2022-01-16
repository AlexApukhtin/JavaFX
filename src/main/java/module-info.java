module com.example.fx_dz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_dz to javafx.fxml;
    exports com.example.fx_dz;
}