package com.company;
// Создать список и объекты Reader и Writer, передать один и тот же список обоим.
// Создать 1 поток для Reader и 1 для Writer, запустить их.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(new Reader(list));
        Thread t2 = new Thread(new Writer(list));
        t1.start();
        t2.start();
    }
}