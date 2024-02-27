module fakhredinne.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens fakhredinne.calculator to javafx.fxml;
    exports fakhredinne.calculator;
}