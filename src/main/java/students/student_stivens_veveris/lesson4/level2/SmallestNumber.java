package students.student_stivens_veveris.lesson4.level2;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        System.out.println("Please input first whole number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Please input second whole number:");
        int number2 = scanner.nextInt();

        if (number < number2) {
            System.out.println("Smallest number is " + number);
        } else if (number > number2) {
            System.out.println("Smallest number is " + number2);
        }


    }
}
