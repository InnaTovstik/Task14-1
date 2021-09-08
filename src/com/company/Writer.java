package com.company;
// Написать класс Writer, который реализует интерфейс Runnable.
// Должен быть конструктор, который принимает список чисел.
// В методе run() 1 раз в 2.5 секунды нужно добавлять случайные числа в список.

import java.util.ArrayList;
import java.util.Random;

public class Writer implements Runnable {

    ArrayList<Integer> arrayList;

    public Writer(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public static int getElement() {
        Random random = new Random();
        return random.nextInt(100);
    }

    @Override
    public void run() {
        System.out.println("BEGIN Writer");
        try {
            while (true) {
                int addElement = getElement();
                arrayList.add(addElement);
                System.out.println("add: " + addElement);
                Thread.sleep(2_500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH Writer");
    }
}