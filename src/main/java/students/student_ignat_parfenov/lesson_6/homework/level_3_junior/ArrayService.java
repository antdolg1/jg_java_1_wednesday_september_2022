package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        boolean found = false;
        for (int arrayNumber : arr) {
            if (arrayNumber == numberToSearch) {
                found = true;
                break;
            }
        }
        return found;
    }
}
