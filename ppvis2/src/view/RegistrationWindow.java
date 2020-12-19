package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationWindow extends JFrame implements IVisible{
    JTextField fullnameField;
    JTextField phoneNumberField;
    JPasswordField passwordField;

    public RegistrationWindow(){
        super("Окно регистрации");

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        fullnameField = new JTextField("Введите ФИО", 30);
        phoneNumberField = new JTextField("Введите номер телефона (+375441234567)", 13);
        JLabel passwordLabel = new JLabel("Введите пароль");
        passwordField = new JPasswordField( 13);
        passwordField.setEchoChar('*');


        JButton buttonConfirm = new JButton("Зарегистрироваться");
        buttonConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // внести в список пользователей и вернуться в start window
            }
        });


        JPanel grid = new JPanel(new GridLayout(6, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Регистрация покупателя</h2></html>"));
        grid.add(fullnameField);
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
