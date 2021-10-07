package io.pera.c09;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.print("Enter base number: ");
            int baseNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter pow number: ");
            int powerOfNumber = Integer.parseInt(scanner.nextLine());

            System.out.printf("Exponential expression and result (%d, %d) = %d%n", baseNumber, powerOfNumber, pow(baseNumber, powerOfNumber));
        }

    }

    public static int pow(int baseNumber, int powerOfNumber) {
        if (baseNumber <= 0)
            return 1;

        int result = 1;

        for (int i = 0; i < powerOfNumber; i++) {
            result *= baseNumber;
        }
        return result;
    }

}

// OUTPUT
/*

Enter base number: 2
Enter pow number: 3
Exponential expression and result (2, 3) = 8

 */