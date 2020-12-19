package view;

import controller.BonusesPayWindowController;
import controller.TicketPurchaseWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketPurchaseWindow extends JFrame implements IVisible{

    TicketPurchaseWindowController ticketPurchaseWindowController;
    BonusesPayWindowController bonusesPayWindowController;
    JTextField tripNumber;

    public TicketPurchaseWindow(IVisible cardPayWindow, IVisible userWindow, IVisible bonusesPayWindow){
        super("Окно покупки билета");

        bonusesPayWindowController = new BonusesPayWindowController(userWindow);
        ticketPurchaseWindowController = new TicketPurchaseWindowController(cardPayWindow, userWindow, bonusesPayWindow);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tripNumber = new JTextField("Введите номер рейса");

        JButton buttonOnCardsPay = new JButton("Оплатить картой");
        buttonOnCardsPay.addActionListener(ticketPurchaseWindowController.ListenerForCardPayWindow);

        JButton buttonOnCashPay = new JButton("Оплатить наличными");
        buttonOnCashPay.addActionListener(ticketPurchaseWindowController.ListenerForCashPayWindow);

        JButton buttonOnBonusPay = new JButton("Оплатить бонусами");
        buttonOnBonusPay.addActionListener(bonusesPayWindowController.ListenerForOpenBonusesPayWindow);

        JButton buttonOnBackToTheUserWindow = new JButton("Вернуться на страницу покупателя");
        buttonOnBackToTheUserWindow.addActionListener(ticketPurchaseWindowController.ListenerForBackToUserWindow);

        JPanel grid = new JPanel(new GridLayout(7, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Окно покупки билета</h2></html>"));
        grid.add(tripNumber);
        grid.add(buttonOnCardsPay);
        grid.add(buttonOnCashPay);
        grid.add(buttonOnBonusPay);
        grid.add(buttonOnBackToTheUserWindow);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
