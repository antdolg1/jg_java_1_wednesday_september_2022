package students.student_svetlana_seda.lesson_2.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first double number:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Please enter the second double number:");
        double secondDoubleNumber =scanner.nextDouble();
        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);

    }

}

