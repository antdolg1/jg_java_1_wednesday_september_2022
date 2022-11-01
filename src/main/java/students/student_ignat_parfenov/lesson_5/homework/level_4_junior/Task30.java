package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {

        System.out.println("Please input your array length: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();
        int[] cloneArray = new int[arrayIndex];
        Task30 arrayNum = new Task30();
        arrayNum.randomArray(cloneArray);
        System.out.println("Your array is: " + Arrays.toString(cloneArray));
        arrayNum.notEvenNumber(cloneArray);
    }

    void randomArray(int[] cloneArray) {
        for (int i = 0; i < cloneArray.length; i++) {
            Random random = new Random();
            cloneArray[i] = random.nextInt(50);
        }
    }

    void notEvenNumber(int[] cloneArray) {
        int notEvenNumber;
        System.out.print("Array's even numbers are: ");
        System.out.print("[");
        for (int userNumber : cloneArray) {
            if (userNumber % 2 != 0) {
                notEvenNumber = userNumber;
                System.out.print(" " + notEvenNumber + " ");
            }
        }
        System.out.println("]");
    }
}
