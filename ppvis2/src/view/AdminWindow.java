package view;

import javax.swing.*;
import java.awt.*;

import controller.AdminWindowController;

public class AdminWindow extends JFrame implements IVisible {

     AdminWindowController adminWindowController;
     JButton buttonOpenAddAdminWindow;
     JButton buttonOnOpenAddTransportWindow;
     JButton buttonOnOpenAddTripWindow;


     public AdminWindow(IVisible newAdminWindow, IVisible newTransportWindow, IVisible newTripWindow) {
          super("Окно администратора");

          adminWindowController = new AdminWindowController(newAdminWindow, newTransportWindow, newTripWindow);
          setSize(600, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


          buttonOpenAddAdminWindow = new JButton("Добавить администратора");
          buttonOpenAddAdminWindow.addActionListener(adminWindowController.listenerForCreateAdminWindow);

          buttonOnOpenAddTransportWindow = new JButton("Добавить транспорт");
          buttonOnOpenAddTransportWindow.addActionListener(adminWindowController.listenerForCreateTransportWindow);

          buttonOnOpenAddTripWindow = new JButton("Добавить рейс");
          buttonOnOpenAddTripWindow.addActionListener(adminWindowController.listenerForCreateTripWindow);


          JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
          grid.add(new JLabel("<html><h2>Окно администратора</h2></html>"));
          grid.add(buttonOpenAddAdminWindow);
          grid.add(buttonOnOpenAddTransportWindow);
          grid.add(buttonOnOpenAddTripWindow);

          JPanel panel = new JPanel(new FlowLayout());
          panel.add(grid);
          Container container = getContentPane();
          container.add(panel);
     }
}
