package view;

import controller.NewAdminWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAdminWindow extends JFrame implements IVisible{

    NewAdminWindowController newAdminWindowController;
    JTextField loginField;
    JPasswordField passwordField;
    JButton buttonConfirm;

    public NewAdminWindow(IVisible adminWindow){
        super("Окно добавления нового администратора");

        newAdminWindowController = new NewAdminWindowController(adminWindow);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        loginField = new JTextField("Введите логин", 13);
        JLabel passwordLabel = new JLabel("Введите пароль");
        passwordField = new JPasswordField( 13);
        passwordField.setEchoChar('*');

        buttonConfirm = new JButton("Подтвердить");
        buttonConfirm.addActionListener(newAdminWindowController.ListenerForAddNewAdmin);


        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Добавление нового администратора</h2></html>"));
        grid.add(loginField);
        grid.add(passwordLabel);
        grid.add(passwordField);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
