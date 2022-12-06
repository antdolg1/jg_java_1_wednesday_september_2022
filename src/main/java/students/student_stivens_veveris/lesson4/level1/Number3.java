package students.student_stivens_veveris.lesson4.level1;

import java.util.Scanner;

public class Number3 {

    public static void main(String[] args) {

        System.out.println("Please input your whole number from 1 to 7: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Sunday");
        } else if (number == 7) {
            System.out.println("Saturday");
        } else if (number < 0) {
            System.out.println("Your number is less than 0");
        } else {
            System.out.println("Wrong input number");
        }
    }
}
