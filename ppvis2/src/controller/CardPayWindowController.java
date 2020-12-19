package controller;

import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPayWindowController {
    IVisible userWindow;

    public CardPayWindowController(IVisible userWindow){
        this.userWindow = userWindow;
    }

    public ActionListener ListenerForOpenCardPayWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Оплата прошла успешно");
            userWindow.setVisible(true);
        }
    };
}
