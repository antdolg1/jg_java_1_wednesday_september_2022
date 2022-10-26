package students.student_aleksandrs_mads.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextInt();
        System.out.println(firstDoubleNumber);
        double secondDoubleNumber = scanner.nextInt();
        System.out.println(secondDoubleNumber);
        double summ = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.println(summ);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
