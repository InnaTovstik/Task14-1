package com.company;
//Написать класс Reader, который реализует интерфейс Runnable.
// Должен быть конструктор, который принимает список чисел.
// В методе run() 1 раз в 1 секунду нужно проверять есть ли элементы в списке.
// Если есть - печатать их в консоль и удалять (метод clear() у списка) .
// Если нет - печатать в консоль дату и сообщение "The list is empty".

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reader implements Runnable {

    ArrayList<Integer> arrayList;

    public Reader(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        System.out.println("BEGIN Reader");
        try {
            while (true) {
                Thread.sleep(1_000);
                if (!arrayList.isEmpty()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println("clear: " + arrayList.get(i) + " ");
                    }
                    arrayList.clear();

                } else {
                    LocalDateTime localDateTime = LocalDateTime.now();
                    System.out.println(localDateTime + "   The list is empty");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH Reader");
    }
}