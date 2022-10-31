package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task27 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.print("Please input your array length: ");
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int[] randomArray = new int[volume];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(70);
            System.out.println(randomArray[i]);
        }
        int maxNum = randomArray[0];
        for (int j : randomArray) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Array maximum number = " + maxNum);
    }
}


