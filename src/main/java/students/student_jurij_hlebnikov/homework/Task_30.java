package students.student_jurij_hlebnikov.homework;

import java.util.Arrays;

public class Task_30 {
    public static void main(String[] args) {

        int arrayLength = (int) (Math.random() * 30 + 1);
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            array[i] = (int) (Math.random() * 30);
        }

        System.out.println("Array lang is: " + arrayLength);
        String elements = Arrays.toString(array);
        System.out.println("Array numbers: " + elements);

        Arrays.sort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));

        System.out.print("All odd numbers is: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.print(" " + array[i]);
            }
        }

    }
}
