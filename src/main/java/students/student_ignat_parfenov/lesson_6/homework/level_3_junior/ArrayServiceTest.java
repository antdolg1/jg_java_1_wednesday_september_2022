package students.student_ignat_parfenov.lesson_6.homework.level_3_junior;

public class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        private void isArrayContainsGivenNumber() {
         int[] arr = {2, 5, 7, 9, 12};
         int numberToSearch = 9;
         ArrayService arrayService = new ArrayService();
         boolean realResult = arrayService.contains(arr, 9);
         if (realResult) {
             System.out.println("Test is DONE! Array consists the given number " + numberToSearch);
         } else {
             System.out.println("Test is FAILD! The given number " + numberToSearch + " doesn't consist in the array");
         }
    }
}
