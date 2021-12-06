package io.pera.c20;

public class Task06 {
    public int[] twoSum(int[] myArray, int value){
        /*
        * KULLANICIDAN ARRAY AL
        * VALUE AL
        * ARRAYİN İÇİNİ GEZ
        * HANGİ 2 SAYININ TOPLAMI VALUE A EŞİT;
        * RETURN İNDEX
          int[] s = {1,3,5,7,34,87}
          */

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1 ; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == value) {
                    return new int[] {i,j};

                }
            }
        }
        throw new RuntimeException("VALID");

    }

    public static void main(String[] args) {
        int[] myArray = {3,4,5,6,7,3,21,2};
        int[] myArray2 = {23};
        int value = 7;
    }
}
