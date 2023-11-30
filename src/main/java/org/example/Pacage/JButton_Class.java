package org.example.Pacage;

import javax.swing.*;

public class JButton_Class extends JFrame { ////необходимо получить доступ к методам, содержащимся в библиотеке
    private static final int WINDOW_HEIGHT = 800; //Высоты
    private static final int WINDOW_WIDTH = 800; //Ширина
    private static final int WINDOW_POSX = 100; // Положение окна по оси Х
    private static final int WINDOW_POSY = 100; // Положение окна по оси Y
    JButton btnStart = new JButton("new gams"); // создание кнопки
    JButton btnExit = new JButton("Close"); // создание кнопки

    JButton_Class(){
        // Установка всех начальных свойств окна осуществляется вызовом соответствующих
        // сеттеров в конструкторе.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //константы для завершения программы вместе с закрытием окна
        setLocation(WINDOW_POSX, WINDOW_POSY); //Позиционирует окно относительно экрана
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //определение размеров окна;
        setTitle("truuuu"); //метод меняющий название окна
        setResizable(false); //метод запретив пользователю изменять его размеры (true - разрешает false - запрещает)
        add(btnStart);

        setVisible(true); // метод делающий окно видимым
    }

    public static void main(String[] args) {
       new JButton_Class();
    }
}
