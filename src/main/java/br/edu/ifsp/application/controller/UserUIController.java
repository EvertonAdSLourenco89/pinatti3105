package br.edu.ifsp.application.controller;

import br.edu.ifsp.application.views.WindowLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public class UserUIController {
    public void voltarUserMenuUI(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("MenuUI");
    }

    public void createUser(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("UserCreateUI");
    }

    public void updateUser(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("UserUpdateUI");
    }
}
