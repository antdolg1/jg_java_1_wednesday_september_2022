package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_15;

import java.util.Arrays;

class ArrayService {

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
        return 0;
    }
}
