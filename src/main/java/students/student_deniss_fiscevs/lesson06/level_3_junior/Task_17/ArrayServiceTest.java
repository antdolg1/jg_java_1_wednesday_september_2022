package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_17;


import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.arrayIsSorted();
        test.arrayIsNotSorted();
    }

    void arrayIsSorted() {
        ArrayService victim = new ArrayService();
        int[] arr = {4, 5, 2, 1, 3, 6};
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        victim.sort(arr);
        if (Arrays.equals(arr, sortedArray)) {
            System.out.println("Is array sorted test = OK");
            System.out.println("Expected result " + Arrays.toString(sortedArray));
            System.out.println("Actual result " + Arrays.toString(arr));
        } else {
            System.out.println("Is array sorted test = FAIL");
            System.out.println("Expected result " + Arrays.toString(sortedArray));
            System.out.println("Actual result " + Arrays.toString(arr));
        }
    }

    void arrayIsNotSorted() {
        ArrayService victim = new ArrayService();
        int[] arr = {4, 5, 2, 1, 3, 6};
        int[] notSortedArray = {4, 5, 2, 1, 3, 6};
        victim.sort(arr);
        if (Arrays.equals(arr, notSortedArray)) {
            System.out.println("Is array not sorted = FAIL");
            System.out.println("Expected result " + Arrays.toString(notSortedArray));
            System.out.println("Actual result " + Arrays.toString(arr));
        } else {
            System.out.println("Is array not sorted test = OK");
            System.out.println("Expected result " + Arrays.toString(notSortedArray));
            System.out.println("Actual result " + Arrays.toString(arr));
        }
    }

}