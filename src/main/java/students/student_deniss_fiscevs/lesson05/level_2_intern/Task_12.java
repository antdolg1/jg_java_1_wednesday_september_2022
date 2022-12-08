package students.student_deniss_fiscevs.lesson05.level_2_intern;

import java.util.Random;

class Task_12 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] number = new int[3];
        number[0] = random.nextInt();
        number[1] = random.nextInt();
        number[2] = random.nextInt();
        System.out.println("First number = " + number[0]);
        System.out.println("Second number = " + number[1]);
        System.out.println("Third number = " + number[2]);
    }
}
