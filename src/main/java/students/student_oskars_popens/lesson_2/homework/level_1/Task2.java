package students.student_oskars_popens.lesson_2.homework.level_1;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDbl;
        double secondDbl;

        System.out.println("Please enter 1st number:");
        firstDbl = scanner.nextDouble();
        System.out.println("Please ender 2nd number:");
        secondDbl = scanner.nextDouble();
        System.out.println("============================");
        System.out.printf("%f + %f = %f\n", firstDbl, secondDbl, firstDbl+secondDbl);
        System.out.printf("%f - %f = %f\n", firstDbl, secondDbl, firstDbl-secondDbl);
        System.out.printf("%f * %f = %f\n", firstDbl, secondDbl, firstDbl*secondDbl);
        System.out.printf("%f / %f = %f\n", firstDbl, secondDbl, firstDbl/secondDbl);

    }
}
