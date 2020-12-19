package controller;

import model.Customer;
import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AuthorizationCustomerWindowController {
    IVisible userWindow;
    ArrayList<Customer> customers;

    public AuthorizationCustomerWindowController(IVisible userWindow) {
        customers = new ArrayList<>();
        this.userWindow = userWindow;
    }

    public ActionListener ListenerForAuthorizationUserWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Проверка на соответствие введенных данных с хранимыми
            userWindow.setVisible(true);
        }
    };
}
