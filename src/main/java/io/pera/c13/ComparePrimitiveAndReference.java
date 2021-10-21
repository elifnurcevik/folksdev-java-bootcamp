package io.pera.c13;

public class ComparePrimitiveAndReference {

    public static void main(String[] args) {
        int[] value = new int[999999];

        long firstName = System.nanoTime();

        for (int i = 0; i < 999999; i++) {
            value[i] = i;
        }
        long lastTime = System.nanoTime();

        Integer[] reference = new Integer[999999];

        long firstTime2 = System.nanoTime();
        for (int i = 0; i < 999999; i++) {
            reference[i] = new Integer(i);
        }
        long lastTime2 = System.nanoTime();

        System.out.println("reference tip yaklaşık " + (lastTime2 - firstTime2) + " kat büyük");
    }
}
