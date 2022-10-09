package students.student_deniss_fiscevs;

import java.util.Scanner;

public class lesson02_junior_03_09 {

    public static void main(String[] args) {

        System.out.print("Please, enter a number: ");

        int userNumber;
        Scanner myscanner = new Scanner(System.in);
        userNumber = myscanner.nextInt();

        System.out.println();

        System.out.println("Multiplication from 1 till 10 of this number will be: ");

        int x1 = userNumber;
        System.out.println(userNumber + " x" + " 1" + " = " + x1);

        int x2 = userNumber * 2;
        System.out.println(userNumber + " x" + " 2" + " = " + x2);

        int x3 = userNumber * 3;
        System.out.println(userNumber + " x" + " 3" + " = " + x3);

        int x4 = userNumber * 4;
        System.out.println(userNumber + " x" + " 4" + " = " + x4);

        int x5 = userNumber * 5;
        System.out.println(userNumber + " x" + " 5" + " = " + x5);

        int x6 = userNumber * 6;
        System.out.println(userNumber + " x" + " 6" + " = " + x6);

        int x7 = userNumber * 7;
        System.out.println(userNumber + " x" + " 7" + " = " + x7);

        int x8 = userNumber * 8;
        System.out.println(userNumber + " x" + " 8" + " = " + x8);

        int x9 = userNumber * 9;
        System.out.println(userNumber + " x" + " 9" + " = " + x9);

        int x10 = userNumber * 10;
        System.out.println(userNumber + " x" + " 10" + " = " + x10);

    }
}
