package io.pera.c04;

public class Task {

    // prime numbers from 1 to 100
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            int flag = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(number + ", ");
            }
        }
        System.out.println();
    }

}

// OUTPUT
/*

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

 */
