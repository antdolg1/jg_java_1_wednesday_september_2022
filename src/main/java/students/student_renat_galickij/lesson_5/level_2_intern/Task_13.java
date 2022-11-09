package students.student_renat_galickij.lesson_5.level_2_intern;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(0, 100);
        int num2 = random.nextInt(0, 100);
        int num3 = random.nextInt(0, 100);
        int[] numbers = new int[3];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        System.out.println(numbers[0] + numbers[1] + numbers[2]);
    }
}
