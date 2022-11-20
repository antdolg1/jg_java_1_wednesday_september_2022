package students.student_jurij_hlebnikov.homework_leson_6;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int matchCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                matchCounter++;
            }
        }
        return matchCounter;
    }
}
