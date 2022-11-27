package teacher.lesson_5.lessoncode;

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

    static int minNumberInArray(int[] numbers) {

        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        return minNumber;
    }

    static int maxNumberInArray(int[] numbers) {

        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

}
