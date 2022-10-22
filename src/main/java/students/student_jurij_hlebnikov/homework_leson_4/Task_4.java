package students.student_jurij_hlebnikov.homework_leson_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String [] args){

        System.out.println("Please Give a Check Number:");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int testNumber = userNumber % 2;

        System.out.print("That Number is ");

        if(testNumber == 0 ){
            System.out.println("Even Number!");
        } else if (testNumber != 0) {
            System.out.println("Odd Number!");
        }
    }
}
