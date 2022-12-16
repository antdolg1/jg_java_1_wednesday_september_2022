package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_14;

class ArrayService {

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }
}