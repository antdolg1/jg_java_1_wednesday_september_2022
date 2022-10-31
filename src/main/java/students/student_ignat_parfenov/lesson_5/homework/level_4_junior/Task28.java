package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;

public class Task28 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randArray = new int[8];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(35);
            System.out.println(randArray[i]);
        }
        int minNum = randArray[0];
        for (int j : randArray) {
            if (j < minNum)
                minNum = j;
        }
        System.out.println("Array minimum number = " + minNum);
    }
}

