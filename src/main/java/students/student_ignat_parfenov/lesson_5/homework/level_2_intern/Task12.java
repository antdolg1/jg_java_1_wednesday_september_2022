package students.student_ignat_parfenov.lesson_5.homework.level_2_intern;

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {
        int[] randomArray = new int[3];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * randomArray.length);
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }

        System.out.println("________________________" + "\n");
        Random random = new Random();
        int[] mas = new int[4];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(99);
            System.out.println(mas[i]);
        }
    }
}
