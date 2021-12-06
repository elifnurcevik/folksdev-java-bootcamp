package io.pera.c23;

public class Task02 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        int smallestNumber = 900;
        int largestNumber = 0;

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; column++) {
                int randomNumber = (int)(Math.random() * 100);
                matrix[line][column] = randomNumber;
                System.out.println(line+ ". line " + column + ". element of the column: " + matrix[line][column]);
                if (smallestNumber > randomNumber){
                    smallestNumber = randomNumber;
                }
                if (largestNumber < randomNumber){
                    largestNumber = randomNumber;
                }
            }
        }
        System.out.println("Smallest number in this matrix: " + smallestNumber + " and the largest number: " + largestNumber);
    }
}
