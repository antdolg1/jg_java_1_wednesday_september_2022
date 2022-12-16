package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_12;

class ArrayService {

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
}

