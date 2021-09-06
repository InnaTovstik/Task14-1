package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reader implements Runnable {

    ArrayList<Integer> list;

    public Reader(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("BEGIN Reader");
        LocalDateTime localDateTime = LocalDateTime.now();
        if (list.size() > 0) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    Thread.sleep(1_000);
                    System.out.println("clear: " + list.get(i) + " ");
                }
                list.clear();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(localDateTime + "   The list is empty");
        System.out.println("FINISH Reader");

    }
}


