module br.edu.ifsp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens br.edu.ifsp to javafx.fxml;
    exports br.edu.ifsp;
    exports br.edu.ifsp.application.views;
    opens br.edu.ifsp.application.views;
    exports br.edu.ifsp.application.controller;
    opens br.edu.ifsp.application.controller;
}