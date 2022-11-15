package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_13;

class ArrayService {

    int countOccurrences(int[] arr, int numberToSearch) {

        int countOfMatches = 0;

        for (int element : arr) {
            if (element == numberToSearch) {
                countOfMatches++;
            }
        }
        return countOfMatches;
    }
}

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == numberToSearch) {
//                countOfMatches = countOfMatches + 1;
//            }
//        }
//        return countOfMatches;