package view;

import controller.AuthorizationAdminWindowController;

import javax.swing.*;
import java.awt.*;

public class AuthorizationAdminWindow extends JFrame implements IVisible {
    AuthorizationAdminWindowController authorizationAdminWindowController;
    JTextField loginField;
    JPasswordField passwordField;

    public AuthorizationAdminWindow(IVisible adminWindow) {
        super("Окно авторизации");
        authorizationAdminWindowController = new AuthorizationAdminWindowController(adminWindow);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        loginField = new JTextField("Введите логин", 13);
        JLabel passwordLabel = new JLabel("Введите пароль");
        passwordField = new JPasswordField(13);
        passwordField.setEchoChar('*');

        JButton buttonConfirm = new JButton("Войти");
        buttonConfirm.addActionListener(authorizationAdminWindowController.ListenerForAuthorizationAdminWindow);


        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Авторизация администратора</h2></html>"));
        grid.add(loginField);
        grid.add(passwordLabel);
        grid.add(passwordField);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }

    public String getLoginField() {
        return loginField.getText();
    }

    public char[] getPasswordField(){
        return passwordField.getPassword();
    }
}
