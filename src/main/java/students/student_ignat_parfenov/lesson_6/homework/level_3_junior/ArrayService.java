package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        boolean contains;
        if (Arrays.asList(arr).contains(Arrays.asList(numberToSearch))) contains = true;
        else {
            contains = false;
        }
        return true;
    }
}
