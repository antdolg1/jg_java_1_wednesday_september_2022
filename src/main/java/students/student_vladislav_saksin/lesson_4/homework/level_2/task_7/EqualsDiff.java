package students.student_vladislav_saksin.lesson_4.homework.level_2.task_7;

import java.util.Scanner;

public class EqualsDiff {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Number 1");
        x = scanner.nextInt();
        System.out.println("Please enter Number 2");
        y = scanner.nextInt();

        if (x == y) {
            System.out.println("The numbers are equal");
        }
        if (x != y) {
            System.out.println("The numbers are not equal");
        }
    }
}