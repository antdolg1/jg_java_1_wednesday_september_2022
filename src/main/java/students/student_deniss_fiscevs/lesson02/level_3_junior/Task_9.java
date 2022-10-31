package students.student_deniss_fiscevs.lesson02.level_3_junior;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        System.out.print("Please, enter a number: ");

        int userNumber;
        Scanner myScanner = new Scanner(System.in);
        userNumber = myScanner.nextInt();

        System.out.println();

        System.out.println("Multiplication from 1 till 10 of this number will be: ");

        int multiplyOnOne = userNumber;
        System.out.println(userNumber + " x 1 = " + multiplyOnOne);

        int multiplyOnTwo = userNumber * 2;
        System.out.println(userNumber + " x 2 = " + multiplyOnTwo);

        int multiplyOnThree = userNumber * 3;
        System.out.println(userNumber + " x 3 = " + multiplyOnThree);

        int multiplyOnFour = userNumber * 4;
        System.out.println(userNumber + " x 4 = " + multiplyOnFour);

        int multiplyOnFive = userNumber * 5;
        System.out.println(userNumber + " x 5 = " + multiplyOnFive);

        int multiplyOnSix = userNumber * 6;
        System.out.println(userNumber + " x 6 = " + multiplyOnSix);

        int multiplyOnSeven = userNumber * 7;
        System.out.println(userNumber + " x 7 = " + multiplyOnSeven);

        int multiplyOnEight = userNumber * 8;
        System.out.println(userNumber + " x 8 = " + multiplyOnEight);

        int multiplyOnNine = userNumber * 9;
        System.out.println(userNumber + " x 9 = " + multiplyOnNine);

        int multiplyOnTen = userNumber * 10;
        System.out.println(userNumber + " x 10 = " + multiplyOnTen);

    }
}
