package controller;

import model.Transport;
import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewTransportWindowController {
    Transport transport;
    ArrayList<Transport> transports;
    IVisible adminWindow;

    public NewTransportWindowController(IVisible adminWindow){
        this.adminWindow = adminWindow;
    }

    public ActionListener ListenerForAddTransportWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // добавить transport в transports
            adminWindow.setVisible(true);
        }
    };
}
