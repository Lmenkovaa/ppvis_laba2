package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.UserWindowController;
import view.TicketPurchaseWindow;


public class UserWindow extends JFrame implements IVisible {

    UserWindowController userWindowController;

    public UserWindow(IVisible privateOfficeWindow, IVisible ticketPurchaseWindow) {
        super("Окно пользователя");

        userWindowController = new UserWindowController(privateOfficeWindow, ticketPurchaseWindow);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton buttonOnOpenTripWindow = new JButton("Просмотреть рейсы");
        buttonOnOpenTripWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton buttonOnOpenPrivateOfficeWindow = new JButton("Личный кабинет");
        buttonOnOpenPrivateOfficeWindow.addActionListener(userWindowController.ListenerForOpenPrivateOfficeWindow);

        JButton buttonOnOpenBuyTicketWindow = new JButton("Оплатить билет");
        buttonOnOpenBuyTicketWindow.addActionListener(userWindowController.ListenerForOpenTicketPurchaseWindow);


        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Окно пользователя</h2></html>"));
        grid.add(buttonOnOpenTripWindow);
        grid.add(buttonOnOpenPrivateOfficeWindow);
        grid.add(buttonOnOpenBuyTicketWindow);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }

}
