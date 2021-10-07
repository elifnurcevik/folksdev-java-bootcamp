package io.pera.c08;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number;
        while ((number= Integer.parseInt(scanner.nextLine()))!= 0){
            int reverse= getReverse(number);
            System.out.printf("Your entered number: %d reversed number --> %d%n" , number, reverse);
            System.out.print("Enter a number: ");

        }

    }

    public static int getReverse(int num){
        int reverse= 0;

        while(num != 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

}

// OUTPUT
/*

Enter a number: 05
Your entered number: 5 reversed number--> 5
Enter a number: 65
Your entered number: 65 reversed number--> 56
Enter a number: 1453
Your entered number: 1453 reversed number--> 3541

 */