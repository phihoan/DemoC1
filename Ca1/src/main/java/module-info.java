module com.pph.ca1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pph.ca1 to javafx.fxml;
    exports com.pph.ca1;
}
