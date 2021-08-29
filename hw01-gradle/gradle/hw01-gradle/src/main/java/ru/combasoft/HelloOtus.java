package ru.combasoft;

import java.util.List;
import java.util.ArrayList;

import com.google.common.collect.Lists;

public class HelloOtus {
    public static void main(String[] args) {
        //The exercise aim: it is just to use some classes from Guava in Gradle project
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        List<Integer> reversedSequence = Lists.reverse(sequence);

        System.out.println("Elements in reversed sequence: ");
        for (int element : reversedSequence) {
            System.out.println(element);
        }
    }
}
