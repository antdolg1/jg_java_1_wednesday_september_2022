package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

public class Task28 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.print("Please input your array length: ");
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int[] randArray = new int[volume];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(50);
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

