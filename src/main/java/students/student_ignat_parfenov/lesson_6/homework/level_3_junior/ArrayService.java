package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

import java.util.Arrays;
import java.util.Collections;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        boolean contains = Collections.singletonList(arr).contains(Arrays.asList(numberToSearch));
        System.out.println("Array contains the given number " + numberToSearch);
        return true;
    }
}
