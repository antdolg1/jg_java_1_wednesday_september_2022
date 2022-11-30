package students.student_vladislav_saksin.lesson_4.homework.level_3;

import java.util.Scanner;

public class ThreeNumberComparison {

    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Number 1");
        x = scanner.nextInt();
        System.out.println("Please enter Number 2");
        y = scanner.nextInt();
        System.out.println("Please enter Number 3");
        z = scanner.nextInt();

        if ((x == y) && (y == z)) {
            System.out.println("The numbers are equal");
        } else if ((x != y) && (y != z) && (x != z)) {
            System.out.println("The numbers are not equal");
        } else System.out.println("Neither all are equal or different");
    }
}