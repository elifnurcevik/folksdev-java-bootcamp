package io.pera.c20;

import java.util.Random;

public class Task {

    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(10);
        int number2 = random.nextInt(100-60)+60;
        System.out.println(number);
        System.out.println(number2);


    }
}

