package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
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
