module br.com.brconsorcios {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.brconsorcios to javafx.fxml;
    exports br.com.brconsorcios;
}
