package students.student_vladislav_saksin;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Test Data:");
        System.out.println("Input a number:");
        userNumber = scanner.nextInt();

        System.out.println("Expected Output :");

        System.out.println(userNumber + " x 1 = " + userNumber);
        System.out.println(userNumber + " x 2 = " + userNumber * 2);
        System.out.println(userNumber + " x 3 = " + userNumber * 3);
        System.out.println(userNumber + " x 4 = " + userNumber * 4);
        System.out.println(userNumber + " x 5 = " + userNumber * 5);
        System.out.println(userNumber + " x 6 = " + userNumber * 6);
        System.out.println(userNumber + " x 7 = " + userNumber * 7);
        System.out.println(userNumber + " x 8 = " + userNumber * 8);
        System.out.println(userNumber + " x 9 = " + userNumber * 9);
        System.out.println(userNumber + " x 10 = " + userNumber * 10);


    }


}
