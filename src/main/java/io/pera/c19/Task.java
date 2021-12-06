package io.pera.c19;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 90, 35, 27, 42};

        System.out.println("Numbers: ");
        arrayPrint(numbers);
        arrayExchange(numbers);
        System.out.println("\nNumbers after exchange method: ");
        arrayPrint(numbers);
        selectionSort(numbers);
        System.out.println("\nNumbers after sort method: ");
        arrayPrint(numbers);

    }

    public static void arrayExchange(int[] array) {
       for (int j = array.length - 1; j > 0; j--) {
            int randomIndex = (int) (Math.random() * (j + 1));
            int available = array[j];
            array[j] = array[randomIndex];
            array[randomIndex] = available;
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestNumberAvailable = array[i];
            int indexValueOfSmallestElement = i;

            for (int j = i + 1; j < array.length; j++) {
                if (smallestNumberAvailable > array[j]) {
                    smallestNumberAvailable = array[j];
                    indexValueOfSmallestElement = j;
                }

            }
            if (indexValueOfSmallestElement != i){
                array[indexValueOfSmallestElement] = array[i];
                array[i] = smallestNumberAvailable;
            }
        }

    }

    public static void arrayPrint(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
