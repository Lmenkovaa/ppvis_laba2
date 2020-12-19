package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrivateOfficeWindow extends JFrame implements IVisible{
    JButton buttonOnOpenChangePersonalData;
    public PrivateOfficeWindow() {
        super("Личный кабинет");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        buttonOnOpenChangePersonalData = new JButton("Изменить личные данные");

        buttonOnOpenChangePersonalData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton buttonOnShowPersonalData = new JButton("Просмотреть личные данные");
        buttonOnShowPersonalData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton buttonOnShowOrder = new JButton("Просмотреть историю заказов");
        buttonOnShowOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        JButton buttonOnBackToTheUserWindow = new JButton("Вернуться на страницу покупателя");
        buttonOnBackToTheUserWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JPanel grid = new JPanel(new GridLayout(5, 1, 0, 20));
        grid.add(new JLabel("<html><h2>Личный кабинет</h2></html>"));
        grid.add(buttonOnShowOrder);
        grid.add(buttonOnShowPersonalData);
        grid.add(buttonOnOpenChangePersonalData);
        grid.add(buttonOnBackToTheUserWindow);


        JPanel panel = new JPanel(new FlowLayout());
        panel.add(grid);
        Container container = getContentPane();
        container.add(panel);
    }
}
