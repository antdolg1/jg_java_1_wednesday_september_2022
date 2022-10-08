package students.student_jurij_hlebnikov.lesson2;

import java.util.Scanner;

public class Task10Radius {
    public static void main(String[] args) {

        System.out.println("Please Enter Radius Langth:");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double pI = 3.14;

        System.out.println("Area is " + (2*pI*radius)*2);

        System.out.println("Perimeter is " + pI * (radius * 2));

        System.out.println("Thank You!");

    }
}
