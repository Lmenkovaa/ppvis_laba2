package view;

import controller.StartWindowController;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JFrame {

    StartWindowController startWindowController;
    JButton buttonOnOpenLogInUserWindow;
    JButton buttonOnOpenLogInAdminWindow;
    JButton buttonOnOpenRegistrationAdminWindow;


    public StartWindow(IVisible authorizationCustomerWindow,
                       IVisible authorizationAdminWindow, IVisible registrationWindow) {

        super("Начальное окно");

        startWindowController = new StartWindowController(authorizationCustomerWindow,
                authorizationAdminWindow, registrationWindow);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        buttonOnOpenLogInUserWindow = new JButton("Вход пользователя");
        buttonOnOpenLogInUserWindow.addActionListener(startWindowController.listenerForAuthorizationCustomerWindow);

        buttonOnOpenLogInAdminWindow = new JButton("Вход администратора");
        buttonOnOpenLogInAdminWindow.addActionListener(startWindowController.listenerForAuthorizationAdminWindow);

        buttonOnOpenRegistrationAdminWindow = new JButton("Регистрация пользователя");
        buttonOnOpenRegistrationAdminWindow.addActionListener(startWindowController.listenerForRegistrationWindow);

        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Начальное окно</h2></html>"));
        grid.add(buttonOnOpenLogInUserWindow);
        grid.add(buttonOnOpenLogInAdminWindow);
        grid.add(buttonOnOpenRegistrationAdminWindow);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
        setVisible(true);
    }
}
