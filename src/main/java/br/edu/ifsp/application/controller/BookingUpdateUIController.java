package br.edu.ifsp.application.controller;

import br.edu.ifsp.application.views.WindowLoader;
import javafx.event.ActionEvent;

import java.io.IOException;

public class BookingUpdateUIController {

    public void backBookingUpdate(ActionEvent actionEvent) throws IOException {
        WindowLoader.setRoot("BookingUI");
    }

}
