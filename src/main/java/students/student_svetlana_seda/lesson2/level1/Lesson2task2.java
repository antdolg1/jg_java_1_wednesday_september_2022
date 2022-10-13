package students.student_svetlana_seda.lesson2.level1;

import java.util.Scanner;

public class Lesson2task2 {

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
