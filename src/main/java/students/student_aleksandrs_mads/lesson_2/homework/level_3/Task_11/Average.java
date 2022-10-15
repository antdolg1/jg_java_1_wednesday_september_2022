package students.student_aleksandrs_mads.lesson_2.homework.level_3.Task_11;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextInt();
        double numberTwo = scanner.nextInt();
        double numberTree = scanner.nextInt();
        System.out.println("numberOne = " + numberOne);
        System.out.println("numberTwo = " + numberTwo);
        System.out.println("numberTree = " + numberTree);
        System.out.println((numberTree+numberOne+numberTwo)/3);
    }
}
