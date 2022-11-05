package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_14;

import java.util.Arrays;

class ArrayService {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 12, 3, 12};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arrayService.changeFirst(arr, 12, 4));
//        System.out.println(Arrays.toString(arr));
    }

    boolean changeFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean condition = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                condition = true;
                break;
            }
        }
        return condition;
    }

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

