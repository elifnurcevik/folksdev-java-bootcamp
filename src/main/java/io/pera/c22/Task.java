package io.pera.c22;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        showTheMenu();
        int userSelection = 0;

        while (userSelection != 5) {

            if (userSelection == 1){
                updateProduct();
            }else if (userSelection == 2){
                addProduct();
            }else if (userSelection == 3) {
                deleteProduct();
            }else {
                discountedProduct();
            }
            break;
        }

    }

    private static void discountedProduct() {
        System.out.println("\nDiscounted products listed");
    }

    private static void deleteProduct() {
        System.out.println("\nProduct deleted");
    }

    private static void addProduct() {
        System.out.println("\nProduct added");
    }

    public static void updateProduct() {
        System.out.println("\nThe product has been updated");
    }

    public static int showTheMenu() {
        System.out.println("*********** MENU ***********");
        System.out.println("1- Update product");
        System.out.println("2- Add product");
        System.out.println("3- Delete product");
        System.out.println("4- Discounted product");
        System.out.println("5- Log out");
        System.out.print("\nYou can select the operation you want to do by specifying numbers: ");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        return selection;
    }
}
