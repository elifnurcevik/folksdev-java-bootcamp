package io.pera.c21;

public class ReferanceCounting {
    public static void main(String[] args) {
       Sample s ;
       s = new Sample();
        {
            Sample k = s;
            Manple.foo(k);
        }

        s = new Sample();
    }
}

class Sample {

}

class Manple {
    public static void foo(Sample s) {
        Sample k = s;
    }
}
