package io.pera.c18;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The numbers you want to average: ");
        int numbers = scanner.nextInt();

        int[] userNumbers = new int[numbers];
        double average = 0;

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter number: ");
            userNumbers[i] = scanner.nextInt();
            average += userNumbers[i];
        }
        System.out.print("The average of the numbers you entered: " + average / userNumbers.length);
    }
}

// OUTPUT
/*

The numbers you want to average: 4
Enter number:
23
Enter number:
67
Enter number:
4
Enter number:
8
The average of the numbers you entered: 25.5

 */
