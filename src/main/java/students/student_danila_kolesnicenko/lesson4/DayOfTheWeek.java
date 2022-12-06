package students.student_danila_kolesnicenko.lesson4;

import java.util.Scanner;

class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber;

        System.out.println("Please enter your number between 1-7");
        userNumber = scanner.nextInt();

        if (userNumber == 1) {
            System.out.println("Monday");
        } else if (userNumber == 2) {
            System.out.println("Tuesday");
        } else if (userNumber == 3) {
            System.out.println("Wednesday");
        } else if (userNumber == 4) {
            System.out.println("Thursday ");
        } else if (userNumber == 5) {
            System.out.println("Friday");
        } else if (userNumber == 6) {
            System.out.println("Saturday");
        } else if (userNumber == 7) {
            System.out.println("Sunday");
        }

    }
}
