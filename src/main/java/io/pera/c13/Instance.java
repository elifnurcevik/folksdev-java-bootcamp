package io.pera.c13;

public class Instance {

    String name;
    int id;
    int note;
    boolean abc;

    public Instance(String name, int id, int note, boolean abc) {
        this.name = name;
        this.id = id;
        this.note = note;
        this.abc = abc;
    }


    public static void main(String[] args) {

        Instance instance = new Instance("abc", 1, 23, false);

        int a = 5;
        System.out.println(a);
    }
}
