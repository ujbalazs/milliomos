module ub.ub {
    requires javafx.controls;
    requires javafx.fxml;


    opens ub.ub to javafx.fxml;
    exports ub.ub;
}