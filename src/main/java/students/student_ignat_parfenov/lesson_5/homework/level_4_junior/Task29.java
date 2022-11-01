package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;


import java.util.Random;
import java.util.Scanner;

class Task29 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.print("Please input your array length: ");
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int[] numbers = new int[volume];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println(numbers[i]);
        }
    }
}



