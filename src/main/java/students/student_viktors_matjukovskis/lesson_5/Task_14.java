package students.student_viktors_matjukovskis.lesson_5;

import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {

        int[] num = new int[3];
        Random random = new Random();
        num[0] = random.nextInt(99);
        num[1] = random.nextInt(99);
        num[2] = random.nextInt(99);

        int array = num[0] + num[1] + num[2] / 3;
        System.out.println(array);
    }
}
