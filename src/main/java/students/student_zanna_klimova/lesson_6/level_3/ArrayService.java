package students.student_zanna_klimova.lesson_6.level_3;

import java.util.Arrays;

public class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (numberToSearch == arr[i]) {
                System.out.println("Number " + numberToSearch +  " is in array.");
                return true;
            }
        }
        System.out.println("Number " + numberToSearch + " isn't in array.");
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (numberToSearch == arr[i]){
                count = count + 1;
            }
        }
        System.out.println("The number " + numberToSearch + " exists in " +
                "array " + count + " times.");
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (numberToReplace == arr[i]) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int countChangedNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numberToReplace == arr[i]) {
                arr[i] = newNumber;
                countChangedNumbers++;
                return countChangedNumbers;
            }
        }
        System.out.println("Number not found.");
        return newNumber;
    }

    void revert(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    void sort(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
