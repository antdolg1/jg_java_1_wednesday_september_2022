package students.student_viktors_matjukovskis.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class Task_12 {

    public static void main(String[] args) {

        int[] num = new int[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            num[i] = random.nextInt(99);
        }
        System.out.println("Numbers: " + Arrays.toString(num));
    }
}


