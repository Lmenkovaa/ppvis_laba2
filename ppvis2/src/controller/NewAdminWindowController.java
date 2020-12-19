package controller;

import model.Admin;
import view.IVisible;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewAdminWindowController {
    IVisible adminWindow;
    ArrayList<Admin> admins;
    Admin admin;

    public NewAdminWindowController(IVisible adminWindow){
        this.adminWindow = adminWindow;
    }

    public ActionListener ListenerForAddNewAdmin = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //добавление введенного admin в admins
            System.out.println("Новый администратор добавлен");
            adminWindow.setVisible(true);
        }
    };
}
