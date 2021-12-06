package io.pera.c20;

public class Task05 {
    public static int findIndex(int[] myArray, int value) {

        int i;
        for ( i = 0; i < myArray.length; i++) {
            if (myArray[i] == value) {
                return i;
            }
        }
        throw new RuntimeException("VALUE ARRAYDE YOK");
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7};
         int value = 7;
        System.out.println(findIndex(myArray, value));
    }
}
