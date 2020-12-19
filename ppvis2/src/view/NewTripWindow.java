package view;

import controller.NewTripWindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewTripWindow extends JFrame implements IVisible{
    NewTripWindowController newTripWindowController;
    JTextField tripNumber;
    JTextField priceField;
    JTextField departureCityField;
    JTextField arrivalCityField;
    JTextField departurePointField;
    JTextField arrivalPointField;
    JTextField departureTimeField;
    JTextField arrivalTimeField;
    JTextField carNumberField;

    public NewTripWindow(IVisible adminWindow) {
        super("Окно добавления нового рейса");

        newTripWindowController = new NewTripWindowController(adminWindow);

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        tripNumber = new JTextField("Введите номер рейса", 4);
        priceField = new JTextField("Введите цену", 4);
        departureCityField = new JTextField("Город отправления", 8);
        arrivalCityField = new JTextField("Город прибытия", 8);
        departurePointField = new JTextField("Место отправления", 8);
        arrivalPointField = new JTextField("Место прибытия", 8);
        departureTimeField = new JTextField("Время отправления (12:15)", 8);
        arrivalTimeField = new JTextField("Время прибытия (16:40)", 8);
        carNumberField = new JTextField("Введите номер машины", 4);


        JButton buttonConfirm = new JButton("Подтвердить");
        buttonConfirm.addActionListener(newTripWindowController.ListenerForOpenAdminWindow);


        JPanel grid = new JPanel(new GridLayout(11, 1, 0, 5));
        grid.add(new JLabel("<html><h2>Добавление нового рейса</h2></html>"));
        grid.add(tripNumber);
        grid.add(carNumberField);
        grid.add(priceField);
        grid.add(departureCityField);
        grid.add(departurePointField);
        grid.add(arrivalCityField);
        grid.add(arrivalPointField);
        grid.add(departureTimeField);
        grid.add(arrivalTimeField);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
