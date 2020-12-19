package controller;

import model.Customer;
import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BonusesPayWindowController {
    IVisible userWindow;
    Customer customer;

    public BonusesPayWindowController(IVisible userWindow){
        this.userWindow = userWindow;
    }

    public ActionListener ListenerForOpenBonusesPayWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Оплата бонусами прошла успешно");
            userWindow.setVisible(true);
        }
    };
}
