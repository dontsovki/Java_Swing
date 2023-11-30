package org.example.Pacage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 555; //Высоты
    private static final int WINDOW_WIDTH = 507; //Ширина
    private static final int WINDOW_POSX = 0; // Положение окна по оси Х
    private static final int WINDOW_POSY = 0; // Положение окна по оси Y
    JButton btnStart = new JButton("New Game"); //клас отвечающий за кнопки
    JButton btnExit = new JButton("Exit"); // кнопка выход
    SettingsWindow settings;
    Map map;


    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE); //константы для завершения программы вместе с закрытием окна
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe"); // заголовок
        setResizable(false); // Запрещает изменять размеры окна
//        add(btnStart); // Отображение кнопки JButton btnStart передаётся "New Game"

        map = new Map();       //создание объекта - черного экрана
        settings = new SettingsWindow(this); //Объек в качестве ссылки передает себя. поля, одно класса SettingsWindow чтобы иметь возможность экземпляр этого окна показывать когда появится необходимость
        settings.setVisible(true);
        //обработчики кнопок старта новой игры и завершения приложения Эти обработчики необходимо поместить внутрь конструктораосновного окна.
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });


        JPanel panBottom = new JPanel(new GridLayout(1, 2)); // Создание поле с собственнам компановщиком
        panBottom.add(btnStart); // Отображение кнопки JButton btnStart передаётся "New Game"
        panBottom.add(btnExit); // Отображение кнопки JButton btnStart передаётся ""Exit""
        add(panBottom, BorderLayout.SOUTH); //отображение кнопок внизу экрана

        add(map);  //Помещаем карту на экран
//        add(settings);

        setVisible(true);// делает окно видимым

    }
    //В окне настроек описан обработчик нажатия на единственную кнопку, из этого
    //обработчика вызывается единственный доступный метод – «старт новой игры» на
    //основном окне.
    void startNewGame(int mode, int fSzX, int fSzY, int wLen){

        map.startNewGame(mode, fSzX, fSzY, wLen);
        repaint(); // метод для перерисования
    }

    public static void main(String[] args) {

        new GameWindow();
    }

}
