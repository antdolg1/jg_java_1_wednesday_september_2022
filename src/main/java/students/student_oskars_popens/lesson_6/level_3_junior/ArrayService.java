package students.student_oskars_popens.lesson_6.level_3_junior;

class ArrayService {

    //task_12
    boolean contains(int[] array, int numberToSearch) {
        boolean ret = false;
        for (int nr : array) {
            if (numberToSearch == nr) {
                ret = true;
                break;
            }
        }
        return ret;
    }

    // task_13
    int countOccurrences(int[] array, int numberToSearch) {
        int ret = 0;
        for (int nr : array) {
            if (numberToSearch == nr) {
                ret++;
            }
        }
        return ret;
    }

    // task_14
    boolean replaceFirstNumberInArray(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    // task_15
    int replaceAllNumberInArray(int[] array, int numberToReplace, int newNumber) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                ret++;
            }
        }
        return ret;
    }

    // task_16
    void arrayRevert(int[] array) {
        int arrayLength = array.length;
        int tmp;
        for (int i = 0; i < arrayLength / 2; i++) {
            tmp = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = tmp;
        }
    }

    // task_17
    void arraySort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
