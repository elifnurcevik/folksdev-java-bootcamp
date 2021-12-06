package io.pera.c23;

public class Task01 {
    public static void main(String[] args) {
        int numbers[] = new int[100];
        int sumOfAllNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int)(Math.random() * 100);
            numbers[i] = randomNumber;
            sumOfAllNumbers += randomNumber;
        }

        double average = (double) sumOfAllNumbers / numbers.length;

        int numberOfValuesBelowAverage = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                numberOfValuesBelowAverage++;
            }
        }
        System.out.println("Average: " + average + ", number of values below average: " + numberOfValuesBelowAverage);
    }
}
