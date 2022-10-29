package students.student_ilja_morozovs.lesson_5.homework.level_4.Task_30;

import java.util.Arrays;
import java.util.Scanner;

class ArrayNumMin {
    public static void main(String[] args) {
        System.out.println("Please input array volume: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();
        int[] userNumber = new int[arrayIndex];
        ArrayNumMin arrayNumMin = new ArrayNumMin();
        arrayNumMin.arrayRandomNumbers(userNumber);
        System.out.println("Array number is: " + Arrays.toString(userNumber));
        arrayNumMin.notEvenNumbers(userNumber);
    }

    void arrayRandomNumbers(int[] userNumbers) {
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = (int) (Math.random() * userNumbers.length);
        }
    }

    void notEvenNumbers(int[] userNumbers) {
        int notEvenNumber;
        System.out.print("Not even number is: ");
        System.out.print("[");
        for (int numbers : userNumbers) {
            if (numbers % 2 != 0) {
                notEvenNumber = numbers;
                System.out.print(notEvenNumber);
            }
        }
        System.out.print("]");
    }
}
