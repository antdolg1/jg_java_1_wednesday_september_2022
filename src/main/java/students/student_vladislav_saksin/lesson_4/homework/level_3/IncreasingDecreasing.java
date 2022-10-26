package students.student_vladislav_saksin.lesson_4.homework.level_3;

import java.util.Scanner;


public class IncreasingDecreasing {

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

        if ((x < y) && (y < z)) {
            System.out.println("The numbers are increasing");
        } else if ((x > y) && (y > z)) {
            System.out.println("The numbers are decreasing");
        } else System.out.println("Neither increasing or decreasing order");
    }
}