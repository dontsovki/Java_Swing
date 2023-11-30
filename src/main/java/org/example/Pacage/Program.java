package org.example.Pacage;

import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;
import java.util.Objects;

public class Program {

    //Создание окна с одной кнопкой по центру
    public static void OneBatten(){
        JFrame frame = new JFrame("My First GUI"); // Для окна нужна "рама" - Frame
        // стандартное поведение при закрытии окна - завершение приложения
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //константы для завершения программы вместе с закрытием окна
        frame.setSize(300, 300); // размеры окна
        frame.setLocationRelativeTo(null); // окно - в центре экрана
        JButton button = new JButton("Press"); // Экземпляр класса JButton
        // getContentPane() - клиентская область окна
        frame.getContentPane().add(button); // Добавляем кнопку на Frame
        frame.setVisible(true); // Делаем окно видимым
    }

    //Создание окна с двумя кнопками сверху по центру с помощью BorderLayout.NORTH
    public static void TowBatten(){
        JFrame frame = new JFrame("My First GUI");
        // добавляем панель
        JPanel buttonsPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); // окно в центре экрана
        JButton start = new JButton("Старт");
        JButton stop = new JButton("Стоп");
        // добавляем кнопки на панель
        buttonsPanel.add(start);
        buttonsPanel.add(stop);
        // размещаем панель на Frame (верхняя часть)
        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true);
    }

    //Чтобы сделать размер окна фиксированным можно вызвать метод контейнера JFrame setResizable():
    public static void FiksWindow(){
        JFrame frame = new JFrame("My First GUI");
        // задаём путь к иконке (т.е. где находится файл)
        String path = "../images/icon.png";
        // создание через обращение к главному классу приложения и его ресурсам
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(Program.class.getResource(path)));
        // помещение иконки на frame
        frame.setIconImage(icon.getImage());
        JPanel buttonsPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // задание геометрии окна
        frame.setSize(300, 300);
        // запрет изменения размеров
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        JButton start = new JButton("Старт");
        JButton stop = new JButton("Стоп");
        buttonsPanel.add(start);
        buttonsPanel.add(stop);
        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true);
    }

}
