package io.pera.c02;

public class Task {

    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {

            for (int j = 1; j < 7 - i; j++)
                System.out.print("  ");

            for (int k = 1; k <= i; k++)
                System.out.print(k + " ");

            System.out.println();
        }

    }

}

// OUTPUT
/*

          1
        1 2
      1 2 3
    1 2 3 4
  1 2 3 4 5
1 2 3 4 5 6

 */