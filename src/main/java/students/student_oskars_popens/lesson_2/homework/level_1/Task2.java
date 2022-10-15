package students.student_oskars_popens.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstInt;
        double secondInt;

        System.out.println("Please enter 1st number:");
        firstInt = scanner.nextDouble();
        System.out.println("Please ender 2nd number:");
        secondInt = scanner.nextDouble();
        System.out.println("============================");
        System.out.printf("%f + %f = %f\n", firstInt, secondInt, firstInt+secondInt);
        System.out.printf("%f - %f = %f\n", firstInt, secondInt, firstInt-secondInt);
        System.out.printf("%f * %f = %f\n", firstInt, secondInt, firstInt*secondInt);
        System.out.printf("%f / %f = %f\n", firstInt, secondInt, firstInt/secondInt);

    }
}
