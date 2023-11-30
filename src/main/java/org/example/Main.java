package org.example;

import org.example.Pacage.*;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Создание окна с одной кнопкой по центру
        Program.OneBatten();
        //Создание окна с двумя кнопками сверху по центру с помощью BorderLayout.NORTH
        Program.TowBatten();
        //Чтобы сделать размер окна фиксированным можно вызвать метод контейнера JFrame setResizable()
        Program.FiksWindow();



        }
    }