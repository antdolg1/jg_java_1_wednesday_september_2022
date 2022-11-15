package students.student_deniss_fiscevs.lesson06.level_3_junior.Task_14;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.isFirstArrayEntranceReplaced();
        test.doesNotFirstArrayEntranceReplaced();
    }

    void isFirstArrayEntranceReplaced() {

        ArrayService victim = new ArrayService();
        int[] arr = {1, 2, 3, 3};
        int numberToReplace = 3;
        int newNumber = 6;
        boolean expectedResult = true;
        boolean actualResult = victim.replaceFirst(arr, numberToReplace, newNumber);
        if (expectedResult == actualResult) {
            System.out.println("First number entrance in array has changed = OK");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("First number entrance in array has changed = FAIL");
            System.out.println(Arrays.toString(arr));
        }
    }

    void doesNotFirstArrayEntranceReplaced() {

        ArrayService victim = new ArrayService();
        int[] arr = {1, 2, 3, 3};
        int numberToReplace = 4;
        int newNumber = 1;
        boolean expectedResult = false;
        boolean actualResult = victim.replaceFirst(arr, numberToReplace, newNumber);
        if (expectedResult == actualResult) {
            System.out.println("First number entrance in array has not changed = OK");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("First number entrance in array has not changed = FAIL");
            System.out.println(Arrays.toString(arr));
        }
    }

}