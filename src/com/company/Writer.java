package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Writer implements Runnable {

    ArrayList list;

    public Writer(ArrayList list) {
        this.list = list;
    }

    public static int getElement() {
        final Random random = new Random();
        int element = random.nextInt(100);
        return element;
    }

    @Override
    public void run() {
        System.out.println("BEGIN Writer");
        synchronized (this) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    int addElement = getElement();
                    list.add(addElement);
                    System.out.println("add element = " + addElement);
                    Thread.sleep(2_500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FINISH Writer");
    }
}
