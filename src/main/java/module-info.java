module ub.ub {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens ub.ub to javafx.fxml;
    exports ub.ub;
}