package io.pera.c23;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int ekok = ekokBul(firstNumber, secondNumber);

        System.out.println("Ekok " + "( " + firstNumber + "," + secondNumber + " ): " + ekok);
    }

    private static int ekokBul(int firstNumber, int secondNumber) {
        int big = Math.max(firstNumber, secondNumber);
        int ekok = 0;

        for (int i = big; i <= firstNumber * secondNumber; i++) {
            if (i % firstNumber == 0 && i % secondNumber == 0) {
                ekok = i;
                break;
            }
        }
        return ekok;
    }
}
