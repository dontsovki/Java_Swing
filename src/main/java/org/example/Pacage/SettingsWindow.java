package org.example.Pacage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Стартово окно
public class SettingsWindow extends JPanel { //созданая панель для размещения
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 250;
    JButton btnStart = new JButton("Start new game");



    // Конструктор который принимает экземпляр игрового окна. В первую очередь это сделано для передачи параметров игры, а во-вторых,
    //чтобы красиво отцентрировать его относительно основного.
    SettingsWindow(GameWindow gameWindow){
        setLocation(0,0); //Приявязываем к игровому окну;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);



        btnStart.addActionListener(new ActionListener() { //Обработчик кнопки старта новой игры
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0,3,3,3);
                setVisible(false);
            }
        });
        add(btnStart);

    }

}
