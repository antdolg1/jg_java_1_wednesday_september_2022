package students.student_ignat_parfenov.lesson_5.lessoncode;

public class CustomArrayUtils {

    static void printArrayToConsole(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static int sumOfArrayNumbers(int[] numbers) {

        int sumNumbers = 0;

        for (int number : numbers) {
            sumNumbers += number;
        }
        return sumNumbers;
    }
}
