package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int temp; // znachenie
        int arraySize = 20;
        int[] array = new int[arraySize];
        Random newRandom = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = newRandom.nextInt(20) +1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int leftSide = 0;
        int rightSide = array.length - 1;

        do {
            for (int i = leftSide; i < rightSide; i++) { // <- max

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--; // - kolichestvo prohodov
            for (int i = rightSide; i > leftSide; i--) { // -> min
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++; // - s obratnoi storony
        } while (leftSide < rightSide); // uslovie
        for (int i : array
        ) {
            System.out.print(array[i] + " ");
        }
    }


}
