package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_16;


import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.arrayIsReverted();
        test.arrayIsNotReverted();
    }

    void arrayIsReverted() {
        ArrayService victim = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrAfterReverse = {5, 4, 3, 2, 1};
        victim.revert(arr);
        if (Arrays.equals(arr, arrAfterReverse)) {
            System.out.println("Array is reversed = OK");
            System.out.println("Actual result " + Arrays.toString(arr));
            System.out.println("Expected result " + Arrays.toString(arrAfterReverse));
        } else {
            System.out.println("Array is reversed = FAIL");
            System.out.println("Actual result " + Arrays.toString(arr));
            System.out.println("Expected result " + Arrays.toString(arrAfterReverse));
        }
    }


    void arrayIsNotReverted() {
        ArrayService victim = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrAfterReverse = {1, 2, 3, 4, 5};
        victim.revert(arr);
        if (Arrays.equals(arr, arrAfterReverse)) {
            System.out.println("Array is not reversed = FAIL");
            System.out.println("Actual result " + Arrays.toString(arr));
            System.out.println("Expected result " + Arrays.toString(arrAfterReverse));
        } else {
            System.out.println("Array is not reversed = OK");
            System.out.println("Actual result " + Arrays.toString(arr));
            System.out.println("Expected result " + Arrays.toString(arrAfterReverse));
        }
    }

}