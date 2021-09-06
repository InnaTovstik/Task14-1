package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Writer implements Runnable {

    ArrayList<Integer> list;

    public Writer(ArrayList<Integer> list) {
        this.list = list;
    }

    public static int getElement() {
        Random random = new Random();
        return random.nextInt(100);
    }

    @Override
    public void run() {
        System.out.println("BEGIN Writer");
        try {
            for (int i = 0; i < list.size(); i++) {
                int addElement = getElement();
                list.add(addElement);
                System.out.println("add: " + addElement);
                Thread.sleep(2_500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH Writer");
    }
}

