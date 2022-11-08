package students.student_artjoms_trosihins.lesson_2.level_1;

import java.util.Scanner;

class FractionalMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber;
        double secondDoubleNumber;

        System.out.println("Please write first fractional number :");
        firstDoubleNumber = scanner.nextDouble();
        System.out.println(firstDoubleNumber);

        System.out.println("Please write second fractional number :");
        secondDoubleNumber = scanner.nextDouble();
        System.out.println(secondDoubleNumber);

        double sum = firstDoubleNumber + secondDoubleNumber;
        System.out.println("Sum is " + sum);

        double sub = firstDoubleNumber - secondDoubleNumber;
        System.out.println("Subtraction is " + sub);

        double multi = firstDoubleNumber * secondDoubleNumber;
        System.out.println("Multiplication is " + multi);

        double div = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Division is " + div);
    }
}
