package students.student_jurij_hlebnikov.homework_leson_4;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] arg){

        System.out.println("Good Day To You Citizen.");
        System.out.println("Please Give me a Your Lucky Number!");

        Scanner scanner = new Scanner(System.in);
        int luckyNumber = scanner.nextInt();

        System.out.println("You Have Enter Number: " + luckyNumber);
        System.out.println("Have a Nice Day!");
    }
}
