package br.edu.ifsp.application.views;

import br.edu.ifsp.application.views.WindowLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MainUIController {
    public void menuUI(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("MenuUI");
    }
}
