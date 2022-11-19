package students.student_artjoms_trosihins.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

class RandomArray {
    public static void main(String[] args) {

        int[] num = new int[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            num[i] = random.nextInt(100);
        }
        System.out.println("Array numbers : " + Arrays.toString(num));
    }
}
