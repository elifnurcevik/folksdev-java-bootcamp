package io.pera.c14;

import java.util.Scanner;

public class PalindromWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        String newWord = "";

        for (int i = (word.length() - 1); i >= 0; i--) {
            newWord += word.charAt(i);
        }
        if (newWord.equals(word)) {
            System.out.println(word + " is a Palindrome word.");
        } else {
            System.out.println(word + " is not a Palindrome word.");
        }
    }
}

// OUTPUT
/*

Enter a word: level
level is a Palindrome word.

 */
