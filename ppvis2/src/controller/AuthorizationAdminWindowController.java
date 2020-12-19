package controller;

import model.Admin;
import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Admin;

public class AuthorizationAdminWindowController {
    IVisible adminWindow;
    ArrayList<Admin> admins;

    public AuthorizationAdminWindowController(IVisible adminWindow) {
        admins = new ArrayList<>();
        this.adminWindow = adminWindow;
    }

    public ActionListener ListenerForAuthorizationAdminWindow = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Проверка на соответствие введенных данных с хранимыми
            adminWindow.setVisible(true);
        }
    };
}
