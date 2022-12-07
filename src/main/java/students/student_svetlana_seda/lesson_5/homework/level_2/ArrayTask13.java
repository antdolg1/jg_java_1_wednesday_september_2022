package students.student_svetlana_seda.lesson_5.homework.level_2;

import java.util.Random;

class ArrayTask13 {
    public static void main(String[] args) {

        Random random = new Random();

        int number1 = random.nextInt(0, 10);
        int number2 = random.nextInt(0, 10);
        int number3 = random.nextInt(0, 10);

        int[] numbers = new int[3];
        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;

        System.out.println("First number is " + number1);
        System.out.println("Second number is " + number2);
        System.out.println("Third number is " + number3);

        int sum = numbers[0] + numbers[1] + numbers[2];

        System.out.println("Sum = " + sum);
    }

}
