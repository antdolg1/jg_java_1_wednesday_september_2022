package students.student_stivens_veveris.lesson4.level1;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        System.out.println("Please input your whole number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is higher than 0");
        } else if (number < 0) {
            System.out.println("Your number is less than 0");
        }
    }
}
