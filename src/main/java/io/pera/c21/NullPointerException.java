package io.pera.c21;

public class NullPointerException {
    public static void main(String[] args) {
        String s = null;

        try{
            s.equals("check");
        }catch (java.lang.NullPointerException ex) {
            System.out.println("Null pointer exception yakalandı");
        }
    }
}
