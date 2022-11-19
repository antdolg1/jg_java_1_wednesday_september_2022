package students.student_artjoms_trosihins.level_2.task_14;

import java.util.Random;

class MathAverageArray {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];
        numbers[0] = random.nextInt(20);
        numbers[1] = random.nextInt(50);
        numbers[2] = random.nextInt(90);

        int mathAverArray = (numbers[0] + numbers[1] + numbers[2]) / 3;

        System.out.println(mathAverArray);
    }
}
