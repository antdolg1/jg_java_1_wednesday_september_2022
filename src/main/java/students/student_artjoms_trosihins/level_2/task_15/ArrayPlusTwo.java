package students.student_artjoms_trosihins.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class ArrayPlusTwo {
    public static void main(String[] args) {

        Random random = new Random();

        int[] num = new int[3];
        num[0] = random.nextInt(2000);
        num[1] = random.nextInt(2000);
        num[2] = random.nextInt(1000);

        System.out.println("Array numbers : " + Arrays.toString(num));

        num[0] += 2;
        num[1] += 2;
        num[2] += 2;

        System.out.println("Array numbers : " + Arrays.toString(num));
    }
}
