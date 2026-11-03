
package com.itproger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class video_20 {

    public static void main(String[] args) {

        // Створення вікна
        JFrame window = new JFrame("Моя перша програма");

        // Налаштування розмірів вікна
        window.setSize(500, 350);

        // Завершення програми при закритті вікна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Розташування вікна по центру
        window.setLocationRelativeTo(null);

        // Створення панелі
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        // Створення текстового напису
        JLabel label = new JLabel("Привіт! Це моя Java програма.");

        // Створення кнопки
        JButton button = new JButton("Натисни мене");

        // Додавання елементів на панель
        panel.add(label);
        panel.add(button);

        // Дія при натисканні кнопки
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Кнопку успішно натиснуто!");
            }
        });

        // Додавання панелі у вікно
        window.add(panel);

        // Відображення вікна
        window.setVisible(true);
    }
}
