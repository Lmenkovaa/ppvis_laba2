package controller;

import model.Trip;
import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewTripWindowController {
    IVisible adminWindow;
    Trip trip;
    ArrayList<Trip> trips;

    public NewTripWindowController(IVisible adminWindow){
        this.adminWindow = adminWindow;
    }

    public ActionListener ListenerForOpenAdminWindow =  new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // добавить введенный trip в trips
            adminWindow.setVisible(true);
        }
    };
}
