package io.pera.c07;

public class Task {

    public static void main(String[] args) {

        int rowNumber = 5;

        for (int row = 0; row < rowNumber; row++) {

            for (int space = 0; space < rowNumber - (row + 1); space++)
                System.out.print(" ");

            for (int star = 0; star < 1 + (row * 2); star++)
                System.out.print("*");

            System.out.println();

        }

        for (int row = rowNumber - 2; row >= 0; row--) {

            for (int space = 1; space < rowNumber - row; space++)
                System.out.print(" ");

            for (int star = 0; star < 1 + (row * 2); star++)
                System.out.print("*");

            System.out.println();
        }

    }

}

// OUTPUT
/*

 *
 ***
 *****
 *******
 *********
 *******
 *****
 ***
 *

 */