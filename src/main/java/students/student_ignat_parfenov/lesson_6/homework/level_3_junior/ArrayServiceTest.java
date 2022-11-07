package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

public class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.isArrayContainsGivenNumber();

    }

    private void isArrayContainsGivenNumber() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 5, 7, 9, 12};
        int numberToSearch = 90;
        boolean contains = arrayService.contains(arr, numberToSearch);
        if (contains) {
            System.out.println("Array contains the given number " + numberToSearch);
        } else {
            System.out.println("Test is FAILED! The given number " + numberToSearch + " doesn't consist in the array");
        }
    }
}
