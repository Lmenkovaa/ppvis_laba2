package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.IVisible;

public class AdminWindowController {
    public IVisible newTripWindow;
    public IVisible newAdminWindow;
    public IVisible newTransportWindow;

    public AdminWindowController(IVisible newTripWindow, IVisible newAdminWindow, IVisible newTransportWindow) {
        this.newTripWindow = newTripWindow;
        this.newAdminWindow = newAdminWindow;
        this.newTransportWindow = newTransportWindow;

    }

    public ActionListener listenerForCreateTripWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            newTripWindow.setVisible(true);
        }
    };

    public ActionListener listenerForCreateAdminWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            newAdminWindow.setVisible(true);
        }
    };

    public ActionListener listenerForCreateTransportWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            newTransportWindow.setVisible(true);
        }
    };
}
