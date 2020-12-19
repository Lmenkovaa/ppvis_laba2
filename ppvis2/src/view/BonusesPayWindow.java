package view;

import controller.BonusesPayWindowController;
import controller.CardPayWindowController;

import javax.swing.*;
import java.awt.*;

public class BonusesPayWindow extends JFrame implements IVisible{
    BonusesPayWindowController bonusesPayWindowController;
    JTextField phoneNumber;
    public BonusesPayWindow(IVisible userWindow){
        super("Окно оплаты поездки бонусами");

        bonusesPayWindowController = new BonusesPayWindowController(userWindow);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        phoneNumber = new JTextField("Введите номер мобильного телефона", 16);


        JButton buttonConfirm = new JButton("Подтвердить");
        buttonConfirm.addActionListener(bonusesPayWindowController.ListenerForOpenBonusesPayWindow);


        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 5));
        grid.add(new JLabel("<html><h2>Оплата поездки бонусами</h2></html>"));
        grid.add(phoneNumber);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
