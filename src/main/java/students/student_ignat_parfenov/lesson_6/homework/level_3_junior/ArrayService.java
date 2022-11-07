package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        boolean condition = false;
        for (int arrayNumber : arr) {
            if (arrayNumber == numberToSearch) {
                condition = true;
                break;
            }
        }
        return condition;
    }
}
