package com.company;
// Создать список и объекты Reader и Writer, передать один и тот же список обоим.
// Создать 1 поток для Reader и 1 для Writer, запустить их.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Thread t1 = new Thread(new Reader(arrayList));
        Thread t2 = new Thread(new Writer(arrayList));
        t1.start();
        t2.start();
    }
}