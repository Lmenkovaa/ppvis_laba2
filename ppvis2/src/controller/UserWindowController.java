package controller;

import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserWindowController {
    view.IVisible privateOfficeWindow;
    IVisible ticketPurchaseWindow;

    public UserWindowController(IVisible privateOfficeWindow, IVisible ticketPurchaseWindow){
        this.privateOfficeWindow = privateOfficeWindow;
        this.ticketPurchaseWindow = ticketPurchaseWindow;
    }

    public ActionListener ListenerForOpenPrivateOfficeWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            privateOfficeWindow.setVisible(true);
        }
    };

    public ActionListener ListenerForOpenTicketPurchaseWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ticketPurchaseWindow.setVisible(true);
        }
    };
}
