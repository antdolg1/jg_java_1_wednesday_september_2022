package students.student_vladislav_saksin.lesson_4.homework.level_3;

import java.util.Scanner;

public class BiggerNumber {

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

        if ((x > y) && (x > z)) {
            System.out.println("Number 1 is biggest");
        } else if ((y > x) && (y > z)) {
            System.out.println("Number 2 is biggest");
        } else if ((z > x) && (z > y)) {
            System.out.println("Number 3 is biggest");
        } else System.out.println("Either two or all numbers are equal");
    }
}