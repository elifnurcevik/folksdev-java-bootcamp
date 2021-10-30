package io.pera.c18;

public class Task03 {
    public static void main(String[] args) {
        int[][] matris1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] matris2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] matrisCarpimlari = new int[3][3];

        System.out.println("1. Matris \t");
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                System.out.printf("[%d][%d] \t", i + 1, j + 1);
            }
            System.out.printf("\n");
        }
        System.out.println("\n2. Matris \t");
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.printf("[%d][%d] \t", i + 1, j + 1);
            }
            System.out.printf("\n");
        }
        for (int i = 0; i < matris1.length; i++)
            for (int j = 0; j < matris2[i].length; j++)
                for (int k = 0; k < matris1[i].length; k++)
                    matrisCarpimlari[i][j] += matris1[i][k] * matris2[k][j];
        System.out.printf("\n1.Matris * 2.Matris\n");
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris2[i].length; j++)
                System.out.printf("%d\t", matrisCarpimlari[i][j]);
            System.out.printf("\n");
        }

    }
}

// OUTPUT
/*

1. Matris
[1][1] 	[1][2] 	[1][3]
[2][1] 	[2][2] 	[2][3]
[3][1] 	[3][2] 	[3][3]

2. Matris
[1][1] 	[1][2] 	[1][3]
[2][1] 	[2][2] 	[2][3]
[3][1] 	[3][2] 	[3][3]

1.Matris * 2.Matris
6	6	6
12	12	12
18	18	18

 */
