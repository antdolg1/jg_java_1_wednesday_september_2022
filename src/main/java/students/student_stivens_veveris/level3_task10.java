package students.student_stivens_veveris;

import java.util.Scanner;

public class level3_task10 {

    public static void main(String[] args) {

        double radius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter circle radius: ");
        radius = scanner.nextDouble();
        System.out.println("______________");
        System.out.println(" ");


        double a = 2;
        double Pi = 3.14;
        double P = a * Pi * radius;
        double b = radius*radius;
        double S = P * b;

        System.out.println("Circle P = " + P);
        System.out.println("Circle Area = " + S);

    }
}
