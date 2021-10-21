package io.pera.c13;

public class StringPool {
    public static void main(String[] args) {

        String productName = "HP";

        String getProductName2 = "HP";

        String getProductName3 = productName;

        String value = new String("HP");

        System.out.println(productName == value);

    }
}
