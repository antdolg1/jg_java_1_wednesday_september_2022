package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_16;


class ArrayService {

    void revert(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
        }
    }

}