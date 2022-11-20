package students.student_artjoms_trosihins.lesson_5.level_2.task_13;

import java.util.Random;

class SumArray {
    public static void main(String[] args) {

        int[] num = new int[3];
        Random random = new Random();
        num[0] = random.nextInt(100);
        num[1] = random.nextInt(100);
        num[2] = random.nextInt(100);

        int arraySum = num[0] + num[1] + num[2];

        System.out.println(arraySum);
    }
}
