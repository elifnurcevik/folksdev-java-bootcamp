package io.pera.c10;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        System.out.print("Enter a number you want to factorial: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int result = 1;

        while (number > 0) {
            result *= number;
            number--;
        }

        System.out.println("Result: " + result);
    }

}

// OUTPUT
/*

Enter a number you want to factorial: 5
Result: 120

 */
