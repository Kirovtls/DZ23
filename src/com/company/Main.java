package com.company;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int a = ran.nextInt(100);
            arr.add(a);
            if (a % 2 == 0) {
                arr2.add(a);
            } else {
                arr3.add(a);
            }
        }
        System.out.println("Random number: " + arr);
        System.out.println("Четные числа: " + arr2);
        System.out.println("Не четные числа: " + arr3);
    }
}
    
