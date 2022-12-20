module br.com.brconsorcios {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.briangui to javafx.fxml;
    opens br.com.briangui.controller to javafx.fxml;

    exports br.com.briangui;
    exports br.com.briangui.controller;
}
