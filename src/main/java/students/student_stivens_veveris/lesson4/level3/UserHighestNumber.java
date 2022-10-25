package students.student_stivens_veveris.lesson4.level3;

import java.util.Scanner;

public class UserHighestNumber {

    public static void main(String[] args) {

        System.out.println("Please input first whole number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Please input second whole number:");
        int number2 = scanner.nextInt();

        System.out.println("Please input third whole number:");
        int number3 = scanner.nextInt();

        if (number > number2 && number > number3) {
            System.out.println("Highest number is: " + number);
        } else if (number2 > number && number2 > number3) {
            System.out.println("Highest number is: " + number2);
        } else if (number3 > number && number3 > number2) {
            System.out.println("Highest number is: " + number3);
        }
    }
}
