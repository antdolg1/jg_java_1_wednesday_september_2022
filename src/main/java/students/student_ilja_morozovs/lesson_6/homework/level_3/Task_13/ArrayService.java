package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_13;

import java.util.Arrays;
import java.util.Scanner;

class ArrayService {
//    public static void main(String[] args) {
//        ArrayService arrayService = new ArrayService();
//        int[] arr = {12, 12, 3, 12};
//        System.out.println(Arrays.toString(arr));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter search number in array");
//        int searchNumber = scanner.nextInt();
//        System.out.println("Число " + searchNumber + " встречается в массиве " +
//                arrayService.countNumberOccurrences(arr, searchNumber) + " раз");
//    }

    boolean contains(int[] arr, int numberToSearch) {
        boolean state = false;
        for (int arrayNumbers : arr) {
            if (arrayNumbers == numberToSearch) {
                state = true;
                break;
            }
        }
        return state;
    }

    int countNumberOccurrences(int[] arr, int numberToSearch) {
        int numberOccurrences = 0;
        for (int arrayNumber : arr) {
            if (arrayNumber == numberToSearch) {
                numberOccurrences += 1;
            }
        }
        return numberOccurrences;
    }
}

