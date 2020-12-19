package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JList;

public class NewTransportWindow extends JFrame implements IVisible{
    JTextField carNumberField;
    JTextField countPlaceField;
    JList<String> carTypeList;
    JRadioButton conditioner;
    JRadioButton wiFi;
    JRadioButton powerSocket;
    JButton buttonConfirm;

    private final String[] carType = { "автобус", "маршрутка"};
    public NewTransportWindow() {
        super("Окно добавления нового транспорта");

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        carNumberField = new JTextField("Введите номер машины", 4);
        countPlaceField = new JTextField("Введите количество мест", 4);
        carTypeList = new JList<String>(carType);

        conditioner = new JRadioButton("Кондиционер");
        wiFi = new JRadioButton("Wi-Fi");
        powerSocket = new JRadioButton("Розетка");

        buttonConfirm = new JButton("Подтвердить");
        buttonConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// добавить траспорт и вернуться в окно администратора
            }
        });


        JPanel grid = new JPanel(new GridLayout(10, 2, 0, 5));
        grid.add(new JLabel("<html><h2>Добавление нового транспорта</h2></html>"));
        grid.add(carNumberField);
        grid.add(carTypeList);
        grid.add(countPlaceField);
        grid.add(conditioner);
        grid.add(wiFi);
        grid.add(powerSocket);
        grid.add(buttonConfirm);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}