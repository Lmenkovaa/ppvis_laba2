package view;

import controller.CardPayWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPayWindow extends JFrame implements IVisible{
    CardPayWindowController cardPayWindowController;
    JTextField cardNumber;
    JTextField cvvField;
    JTextField dateCardField;

    public CardPayWindow(IVisible userWindow){
        super("Окно оплаты поездки картой");

        cardPayWindowController = new CardPayWindowController(userWindow);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        cardNumber = new JTextField("Введите номер карты", 16);
        cvvField = new JTextField("Введите СVV", 3);
        dateCardField = new JTextField("Введите срок годности", 8);


        JButton buttonConfirm = new JButton("Подтвердить");
        buttonConfirm.addActionListener(cardPayWindowController.ListenerForOpenCardPayWindow);


        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 5));
        grid.add(new JLabel("<html><h2>Оплата банковской картой</h2></html>"));
        grid.add(cardNumber);
        grid.add(cvvField);
        grid.add(dateCardField);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
