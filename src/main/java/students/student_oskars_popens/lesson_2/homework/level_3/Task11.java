package students.student_oskars_popens.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double myNumber1, myNumber2, myNumber3, average;

        System.out.println("Please enter 1st number:");
        myNumber1 = scanner.nextDouble();

        System.out.println("Please enter 2nd number:");
        myNumber2 = scanner.nextDouble();

        System.out.println("Please enter 3rd number:");
        myNumber3 = scanner.nextDouble();

        average = (myNumber1+myNumber2+myNumber3)/3;
        System.out.println("Average of following numbers "
                + myNumber1 + ",  "
                + myNumber2 + " and "
                + myNumber3 + " is " + average);
    }
}
