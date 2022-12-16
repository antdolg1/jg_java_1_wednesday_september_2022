package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_15;

import java.util.Arrays;

class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.doesChangedAllNumberEntrances();
        test.doesNotChangedAllNumberEntrances();
    }

    void doesChangedAllNumberEntrances() {

        ArrayService victim = new ArrayService();

        int[] arr = {1, 2, 3, 3, 4, 3};
        int numberToReplace = 3;
        int newNumber = 6;
        int[] arrWithReplacedNumbers = {1, 2, 6, 6, 4, 6};
        victim.replaceAll(arr, numberToReplace, newNumber);
        if (Arrays.equals(arr, arrWithReplacedNumbers)) {
            System.out.println("Numbers are replaced in array test = OK");
            System.out.println("Actual result " + Arrays.toString(arr));
            System.out.println("Expected result " + Arrays.toString(arrWithReplacedNumbers));
        } else {
            System.out.println("Numbers are replaced in array test = FAIL");

        }

    }


    void doesNotChangedAllNumberEntrances() {

        ArrayService victim = new ArrayService();

        int[] arr = {1, 2, 3, 3, 4, 3};
        int numberToReplace = 3;
        int newNumber = 6;
        int[] arrWithReplacedNumbers = {1, 2, 3, 3, 4, 3};
        victim.replaceAll(arr, numberToReplace, newNumber);
        if (Arrays.equals(arr, arrWithReplacedNumbers)) {
            System.out.println("Numbers are NOT replaced in array test = FAIL");
        } else {
            System.out.println("Numbers are NOT replaced in array test = OK");
            System.out.println("Actual result " + Arrays.toString(arr));
            System.out.println("Expected result " + Arrays.toString(arrWithReplacedNumbers));
        }

    }

}