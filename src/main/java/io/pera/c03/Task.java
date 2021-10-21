package io.pera.c03;

public class Task {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            for (int space = 6; space > i; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star < (i * 2); star++) {
                System.out.print("*");
            }

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
 ***********

 */
