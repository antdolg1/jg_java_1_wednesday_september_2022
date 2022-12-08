package students.student_viktors_matjukovskis.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        int[] num = new int[3];
        Random random = new Random();
        num[0] = random.nextInt(99);
        num[1] = random.nextInt(99);
        num[2] = random.nextInt(99);
        System.out.println("Numbers: " + Arrays.toString(num));

        num[0] += 2;
        num[1] += 2;
        num[2] += 2;
        System.out.println("Numbers : " + Arrays.toString(num));
    }
}
