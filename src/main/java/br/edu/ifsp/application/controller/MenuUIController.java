package br.edu.ifsp.application.controller;

import br.edu.ifsp.application.views.WindowLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MenuUIController {
    public void voltarMain(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("MainUI");
    }

    public void bookingMenu(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("BookingUI");
    }
    public void userMenu(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("UserUI");
    }

    public void cashierMenu(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("CashierUI");
    }
    public void categoryMenu(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("CategoryUI");
    }

    public void productMenu(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("ProductUI");
    }

    public void roomMenu(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("RoomUI");
    }
}
