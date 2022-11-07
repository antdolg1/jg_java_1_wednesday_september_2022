package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

import java.util.Arrays;

class ArrayService {

    int[] arr;
    int numberToSearch;

    boolean contains(int[] arr, int numberToSearch) {
        boolean contains = Arrays.asList(arr).contains(Arrays.asList(numberToSearch));
        System.out.println("Array contains the given number " + numberToSearch);
        return contains;
    }
}
