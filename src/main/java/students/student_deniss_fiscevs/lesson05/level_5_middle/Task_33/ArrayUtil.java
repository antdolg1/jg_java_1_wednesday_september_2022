package students.student_deniss_fiscevs.lesson05.level_5_middle.Task_33;

import java.util.Random;

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {

        Random random = new Random();
        int[] arrayElements = new int[10];
        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = random.nextInt(10);
        }
    }
}