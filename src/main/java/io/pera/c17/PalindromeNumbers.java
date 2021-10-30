package io.pera.c17;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        boolean result = palindrome(number);
        System.out.printf("Is %d is a palindrome number?\n", number);
        System.out.println(palindrome(number));

        while (result) {
            System.out.print("\nPlease enter a number: ");
            number = in.nextInt();
            result = palindrome(number);
            System.out.printf("Is %d is a palindrome number?\n", number);
            System.out.println(palindrome(number));
        }
    }

    private static boolean palindrome(int number) {
        String str = String.valueOf(number);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
// OUTPUT
/*

Please enter a number: 121
Is 121 is a palindrome number?
true

Please enter a number: 12321
Is 12321 is a palindrome number?
true

Please enter a number: 123
Is 123 is a palindrome number?
false

 */
