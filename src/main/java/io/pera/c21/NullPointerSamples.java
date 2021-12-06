package io.pera.c21;

public class NullPointerSamples {
    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy");
        System.out.println(d1.name);

        Dog d2 = null;
        System.out.println(d2.name);
    }
}

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
}
