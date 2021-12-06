package io.pera.c23;

public class Task06 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int genelToplam = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            genelToplam = genelToplam + matrix[i][i];
            System.out.println();
        }
        System.out.println("Çapraz elemanların toplamı: " + genelToplam);
    }
}
