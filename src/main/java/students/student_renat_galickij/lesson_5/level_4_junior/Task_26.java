package students.student_renat_galickij.lesson_5.level_4_junior;

import java.util.Scanner;
import java.util.Random;
public class Task_26 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.print("Enter array's length: ");
            int arrayLength = scanner.nextInt();
            int array[] = new int[arrayLength];
            int number = 0;

            for (int i = 0; i < arrayLength; i++) {
                array[number] = random.nextInt(0, 100);
                number++;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }
    }


