package io.pera.c20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static io.pera.c20.Task2.randomGenerate;

public class Task4 {
    public static void main(String[] args) {

        List<String> persons = new ArrayList<>(Arrays.asList("Elif","Kadriye","Alim","Oğuzhan"));

        int counter = 0;

        while (counter<2){

            String selected = persons.get(randomGenerate(0,4));
            persons.remove(selected);
            System.out.println(selected);
            counter++;
        }
    }
    static int randomGenerate(int min, int max){
        return new Random().nextInt(max-min) + min;
    }
}
