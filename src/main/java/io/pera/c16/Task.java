package io.pera.c16;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");

        // OUTPUT
        /*

       Input a string: Folksdev Java Bootcamp
       Reverse string: pmactooB avaJ vedskloF

       */

        System.out.println("    J     a   v       v  a ");
        System.out.println("    J    a a   v     v  a a");
        System.out.println("J   J   aaaaa   V   V  aaaaa");
        System.out.println("J   J  a     a   V V  a     a");
        System.out.println(" JJJ  a       a   V  a       a");
        System.out.println();
        System.out.println("FFFFF  OOOOO  L       K     K   SSSSS   DDDD     EEEEE  V       V ");
        System.out.println("F      O   O  L       K   K     S       D   D    E       V     V ");
        System.out.println("FFF    O   O  L       K K       SSSSS   D    D   EEEEE    V   V ");
        System.out.println("F      O   O  L       K   K         S   D   D    E         V V ");
        System.out.println("F      OOOOO  LLLLLL  K     K   SSSSS   DDDD     EEEEE      V");

    }
}

                                       // OUTPUT

        /*


          J     a   v       v  a
          J    a a   v     v  a a
      J   J   aaaaa   V   V  aaaaa
      J   J  a     a   V V  a     a
       JJJ  a       a   V  a       a

     FFFFF  OOOOO  L       K     K   SSSSS   DDDD     EEEEE  V       V
     F      O   O  L       K   K     S       D   D    E       V     V
     FFF    O   O  L       K K       SSSSS   D    D   EEEEE    V   V
     F      O   O  L       K   K         S   D   D    E         V V
     F      OOOOO  LLLLLL  K     K   SSSSS   DDDD     EEEEE      V


       */



