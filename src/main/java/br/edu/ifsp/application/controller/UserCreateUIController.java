package br.edu.ifsp.application.controller;

import br.edu.ifsp.application.views.WindowLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public class UserCreateUIController {
    public void backUserCreate(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("UserUI");
    }
}
