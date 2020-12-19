package controller;

import view.AuthorizationAdminWindow;
import view.AuthorizationCustomerWindow;
import view.IVisible;
import view.RegistrationWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindowController {
    public IVisible authorizationCustomerWindow;
    public IVisible authorizationAdminWindow;
    public IVisible registrationWindow;

    public StartWindowController(IVisible authorizationCustomerWindow,
                                 IVisible authorizationAdminWindow, IVisible registrationWindow){
        this.authorizationCustomerWindow = authorizationCustomerWindow;
        this.authorizationAdminWindow = authorizationAdminWindow;
        this.registrationWindow = registrationWindow;
    }

    public ActionListener listenerForAuthorizationCustomerWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            authorizationCustomerWindow.setVisible(true);
        }
    };

    public ActionListener listenerForAuthorizationAdminWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            authorizationAdminWindow.setVisible(true);
        }
    };

    public ActionListener listenerForRegistrationWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            registrationWindow.setVisible(true);
        }
    };
}
