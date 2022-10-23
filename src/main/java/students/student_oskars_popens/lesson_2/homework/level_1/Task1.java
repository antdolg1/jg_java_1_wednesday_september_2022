package students.student_oskars_popens.lesson_2.homework.level_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt;
        int secondInt;

        System.out.println("Please enter 1st number:");
        firstInt = scanner.nextInt();
        System.out.println("Please ender 2nd number:");
        secondInt = scanner.nextInt();
        System.out.println("============================");
        System.out.printf("%d + %d = %d\n", firstInt, secondInt, firstInt+secondInt);
        System.out.printf("%d - %d = %d\n", firstInt, secondInt, firstInt-secondInt);
        System.out.printf("%d * %d = %d\n", firstInt, secondInt, firstInt*secondInt);
        System.out.printf("%d / %d = %d\n", firstInt, secondInt, firstInt/secondInt);

    }
}
