package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

public class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.ifArrayContainsGivenNumber();
        arrayServiceTest.ifArrayDoesNotContainGivenNumber();
    }

    private void ifArrayContainsGivenNumber() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {14, 5, 7, 9, 12};
        int numberToSearch = 71;
        boolean contains = arrayService.contains(arr, numberToSearch);
        if (contains) {
            System.out.println("Test is DONE! Array contains the given number " + numberToSearch);
        } else {
            System.out.println("Test is FAILED! The given number " + numberToSearch + " doesn't contain in this array");
        }
    }

    private void ifArrayDoesNotContainGivenNumber() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {14, 5, 7, 9, 12};
        int numberToSearch = 16;
        boolean contains = arrayService.contains(arr, numberToSearch);
        if (contains) {
            System.out.println("Test is FAILED! Array contains the given number " + numberToSearch);
        } else {
            System.out.println("Test is OK! The given number " + numberToSearch + " doesn't consist in the array");
        }
    }
}
