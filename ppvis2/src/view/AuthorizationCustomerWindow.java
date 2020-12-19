package view;

import controller.AuthorizationCustomerWindowController;

import javax.swing.*;
import java.awt.*;

public class AuthorizationCustomerWindow extends JFrame implements IVisible {
    AuthorizationCustomerWindowController authorizationCustomerWindowController;

    public AuthorizationCustomerWindow(IVisible userWindow) {
        super("Окно авторизации");

        authorizationCustomerWindowController = new AuthorizationCustomerWindowController(userWindow);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JTextField phoneNumberField = new JTextField("Введите номер телефона (+375441234567)", 13);
        JLabel passwordLabel = new JLabel("Введите пароль");
        JPasswordField passwordField = new JPasswordField(13);
        passwordField.setEchoChar('*');


        JButton buttonConfirm = new JButton("Войти");
        buttonConfirm.addActionListener(authorizationCustomerWindowController.ListenerForAuthorizationUserWindow);


        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Авторизация покупателя</h2></html>"));
        grid.add(phoneNumberField);
        grid.add(passwordLabel);
        grid.add(passwordField);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
