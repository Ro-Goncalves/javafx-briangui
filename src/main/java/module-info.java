module br.com.briangui {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.briangui to javafx.fxml;
    opens br.com.briangui.controller to javafx.fxml;
    opens br.com.briangui.teste to javafx.fxml;

    exports br.com.briangui;
    exports br.com.briangui.controller;
    exports br.com.briangui.teste;
}
