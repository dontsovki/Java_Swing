package org.example.Pacage;

import javax.swing.*;
import java.awt.*;

public class Layout_GridLayout extends JFrame {

    private static final int WINDOW_HEIGHT = 800; //Высоты
    private static final int WINDOW_WIDTH = 800; //Ширина
    private static final int WINDOW_POSX = 100; // Положение окна по оси Х
    private static final int WINDOW_POSY = 100; // Положение окна по оси Y
    JButton btnStart = new JButton("new gams"); // создание кнопки
    JButton btnExit = new JButton("Close"); // создание кнопки
    JPanel grid = new JPanel(); //создаём вспомогательную панель расположения

    Layout_GridLayout(){
        // Установка всех начальных свойств окна осуществляется вызовом соответствующих
        // сеттеров в конструкторе.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //константы для завершения программы вместе с закрытием окна
        setLocation(WINDOW_POSX, WINDOW_POSY); //Позиционирует окно относительно экрана
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //определение размеров окна;
        setTitle("truuuu"); //метод меняющий название окна
        setResizable(false); //метод запретив пользователю изменять его размеры (true - разрешает false - запрещает)

        /*
         * Первые два параметра конструктора GridLayout определяют количество
         * строк и столбцов в таблице. Вторые 2 параметра - расстояние между
         * ячейками по горизонтали и вертикали
         */
        GridLayout layout = new GridLayout(1, 2, 5, 12);
        grid.setLayout(layout);
        grid.add(btnStart);
        grid.add(btnExit);

        // Размещаем нашу панель в панели содержимого
        getContentPane().add(grid);

        setVisible(true); // метод делающий окно видимым
    }

    public static void main(String[] args) {
        new Layout_GridLayout();
    }
}