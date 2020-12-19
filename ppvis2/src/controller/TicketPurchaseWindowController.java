package controller;

import view.IVisible;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketPurchaseWindowController {

    IVisible cardPayWindow;
    IVisible userWindow;
    IVisible bonusesPayWindow;

    public TicketPurchaseWindowController(IVisible cardPayWindow, IVisible userWindow, IVisible bonusesPayWindow) {
        this.cardPayWindow = cardPayWindow;
        this.userWindow = userWindow;
        this.bonusesPayWindow = bonusesPayWindow;
    }

    public ActionListener ListenerForCardPayWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cardPayWindow.setVisible(true);
        }
    };

    public ActionListener ListenerForCashPayWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JOptionPane(),
                    "Оплатите, пожалуйста, у водителя во время поездки");
        }
    };

    public ActionListener ListenerForBonusesPayWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bonusesPayWindow.setVisible(true);
        }
    };



    public ActionListener ListenerForBackToUserWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            userWindow.setVisible(true);
        }
    };
}
