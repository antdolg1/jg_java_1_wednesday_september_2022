package students.student_jurij_hlebnikov.homework_leson_6;

class ArrayService {           //Task 14

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

    boolean replaceFirst(int[] arr, int numberToFind, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToFind, int newNumber) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToFind) {
                arr[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    void revert(int[] arr) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }


}

