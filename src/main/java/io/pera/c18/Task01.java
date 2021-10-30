package io.pera.c18;

public class Task01 {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double average = 0;

        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Number: " + numbers[index] + " Number pow: " + (int) Math.pow(index, 2));
        }
        for (int index = 0; index < numbers.length; index++) {
            average += numbers.length;
        }
        System.out.println("\nAverage of numbers: " + average / numbers.length);

        findTheTotal(numbers);
    }

    private static void findTheTotal(int[] numbers) {
        int total = 0;

        for (double currentNumber : numbers) {
            total += currentNumber;
        }
        System.out.println("\nSum of numbers: " + total);
    }
}

// OUTPUT
/*

Number: 0 Number pow: 0
Number: 1 Number pow: 1
Number: 2 Number pow: 4
Number: 3 Number pow: 9
Number: 4 Number pow: 16
Number: 5 Number pow: 25
Number: 6 Number pow: 36
Number: 7 Number pow: 49
Number: 8 Number pow: 64
Number: 9 Number pow: 81

Average of numbers: 10.0

Sum of numbers: 45

 */
