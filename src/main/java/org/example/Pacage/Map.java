package org.example.Pacage;

import javax.swing.*;
import java.awt.*;

// Класс создания панели карты игры крестики нолики
public class Map extends JPanel { //созданая панель для размещения
    /*Помимо
ширины и высоты понадобятся переменные, в которых будет храниться высота и
ширина каждой ячейки. Размеры каждой ячейки пригодятся для создания отступа
одной линии от другой. */
    private int panelWidth;
    private int panelHeight;
    private int cellWidth;
    private int cellHeight;
    Map(){         //Создание карты
        setBackground(Color.BLACK); // цвет черный
    }

    //Метод начинающий новую игру
    void startNewGame(int mode, int fSzX, int fSzY, int wLen) {
//        fieldSizeY = fSzY;
//        fieldSizeX = fSzX;
        System.out.printf("Mode: %d\nSize: x=%d;\nWin Length: %d\n", mode, fSzX, fSzY, wLen);
//        this.wLen = wLen;
//        initMap();
//        isGameOver = false;
//        isInitialized = true;
//        repaint();
    }

   /*Для дальнейшей разработки важно отделить стандартный метод рисования
    компонента от пользовательского рисования на этом компоненте, так называемую
    бизнес-логику. Для этого будет создан ещё один метод void render(Graphics g),
который будет вызываться из переопределённого paintComponent(). из самого
paintComponent() вызов метода родительского класса удалять не следует, поскольку
там, скорее всего, происходит что-то важное. Для вызова же метода фреймворка,
необходимо в нужный момент сказать фреймворку что требуется перерисовать
панель, фреймворк поставит метод paintComponent() в очередь сообщений окна, и
когда очередь дойдёт до выполнения этого метода – окно выполнит перерисовку.*/

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    /*объект класса Graphics, который умеет рисовать
    геометрические фигуры, линии, текст и тому подобное.*/
    private void render(Graphics g) {
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        cellHeight = panelHeight / 3;
        cellWidth = panelWidth / 3;
        g.setColor(Color.BLACK);
        for (int h = 0; h < 3; h++) {
            int y = h * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }
        for (int w = 0; w < 3; w++) {
            int x = w * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
    }
}
