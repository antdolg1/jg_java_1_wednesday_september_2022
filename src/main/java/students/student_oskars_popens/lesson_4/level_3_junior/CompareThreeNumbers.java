package students.student_oskars_popens.lesson_4.level_3_junior;

import java.util.Scanner;

class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr1, nr2, nr3;

        System.out.print("Please enter 1st number: ");
        nr1 = sc.nextInt();
        System.out.print("\nPlease enter 2nd number: ");
        nr2 = sc.nextInt();
        System.out.print("\nPlease enter 3rd number: ");
        nr3 = sc.nextInt();

        // Task_8
        System.out.println("===============================================");
        if (nr1 == nr2 && nr2 == nr3) {
            System.out.println("All numbers are equal");
        } else if (nr1 != nr2 && nr2 != nr3 && nr3 != nr1) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        // Task_9
        System.out.println("===============================================");
        if (nr1 < nr2 && nr2 < nr3) {
            System.out.println("increasing");
        } else if (nr1 > nr2 && nr2 > nr3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

        // Task_10
        System.out.println("===============================================");
        if (nr1 >= nr2 && nr1 >= nr3) {
            System.out.println("Max number is - " + nr1);
        } else if (nr2 >= nr3 && nr2 >= nr1) {
            System.out.println("Max number is - " + nr2);
        } else {
            System.out.println("Max number is - " + nr3);
        }
    }
}
