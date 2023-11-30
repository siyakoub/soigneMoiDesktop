module com.soigne.soignemoidesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.soigne.soignemoidesktop to javafx.fxml;
    exports com.soigne.soignemoidesktop;
}