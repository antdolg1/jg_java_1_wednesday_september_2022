package students.student_jurij_hlebnikov.homework_leson_6;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}
