package students.student_vladislav_saksin.lesson_4.homework.level_2.task_5;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Number 1");
        x = scanner.nextInt();
        System.out.println("Please enter Number 2");
        y = scanner.nextInt();

        if (x > y) {
            System.out.println(x);
        }
        if (y > x) {
            System.out.println(y);
        }
    }
}