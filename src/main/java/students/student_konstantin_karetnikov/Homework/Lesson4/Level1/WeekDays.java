package students.student_konstantin_karetnikov.Homework.Lesson4.Level1;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        System.out.print("Please enter day number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        }
        else if (number == 2) {
            System.out.println("Tuesday");
        }
        else if (number == 3) {
            System.out.println("Wednesday");
        }
        else if (number == 4) {
            System.out.println("Thursday");
        }
        else if (number == 5) {
            System.out.println("Friday");
        }
        else if (number == 6) {
            System.out.println("Saturday");
        }
        else if (number == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("There are only seven days in a week!");
        }
    }

}
