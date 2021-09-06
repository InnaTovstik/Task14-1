package com.company;

import java.util.ArrayList;

//Написать класс Reader, который реализует интерфейс Runnable.
// Должен быть конструктор, который принимает список чисел.
// В методе run() 1 раз в 1 секунду нужно проверять есть ли элементы в списке.
// Если есть - печатать их в консоль и удалять (метод clear() у списка) .
// Если нет - печатать в консоль дату и сообщение "The list is empty".
//// Написать класс Writer, который реализует интерфейс Runnable.
// Должен быть конструктор, который принимает список чисел.
// В методе run() 1 раз в 2.5 секунды нужно добавлять случайные числа в список.
// Создать список и объекты Reader и Writer, передать один и тот же список обоим.
// Создать 1 поток для Reader и 1 для Writer, запустить их.
public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);

        Thread t1 = new Thread(new Reader(arrayList));
        Thread t2 = new Thread(new Writer(arrayList));

        t1.start();
        t2.start();



    }
}
