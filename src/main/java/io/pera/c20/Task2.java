package io.pera.c20;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
       /* Random random1 = new Random(System.currentTimeMillis());

        Random random2 = new Random(System.currentTimeMillis());

        System.out.println("random1: "+random1.nextInt());
        System.out.println("random2: "+random2.nextInt());

        int number = (int) (Math.random()*10);

        int number2 = (int) (Math.random()*(60-50)+50);

        System.out.println(number);
        System.out.println(number2);    */

       /* int[] randNumbers = new int[10];

        for (int i = 0; i < randNumbers.length; i++){
            randNumbers[i] = randomGenerate(70,100);
        }
        for (int i = 0; i < randNumbers.length; i++){
            System.out.println(randNumbers[i]+" ");
        }   */

        


    }

    static int randomGenerate(int min, int max){
        return new Random().nextInt(max-min) + min;
    }
}
