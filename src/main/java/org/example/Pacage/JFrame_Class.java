package org.example.Pacage;

import javax.swing.*;

public class JFrame_Class extends JFrame { //наследуемся от класса JFrame - окно
    private static final int WINDOW_HEIGHT = 800; //Высоты
    private static final int WINDOW_WIDTH = 800; //Ширина
    private static final int WINDOW_POSX = 500; // Положение окна по оси Х
    private static final int WINDOW_POSY = 500; // Положение окна по оси Y

    JFrame_Class(){ //Конструктор

        // Установка всех начальных свойств окна осуществляется вызовом соответствующих
        // сеттеров в конструкторе.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //константы для завершения программы вместе с закрытием окна
        setLocation(WINDOW_POSX, WINDOW_POSY); //Позиционирует окно относительно экрана
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //определение размеров окна;

        setVisible(true); // метод делающий окно видимым

    }


    public static void main(String[] args) {
        new JFrame_Class(); //инициализируем конструктор


    }
}
