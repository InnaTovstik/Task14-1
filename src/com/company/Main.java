package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        Thread t1 = new Thread(new Reader(arrayList));
        Thread t2 = new Thread(new Writer(arrayList));

        t1.start();
        t2.start();


    }
}
