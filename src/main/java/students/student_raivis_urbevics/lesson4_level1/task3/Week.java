package students.student_raivis_urbevics.lesson4_level1.task3;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println("Input the any number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wednesday");
        }
        if (number == 4) {
            System.out.println("Thursday");
        }
        if (number == 5) {
            System.out.println("Friday");
        }
        if (number == 6) {
            System.out.println("Saturday");
        }
        if (number == 7) {
            System.out.println("Sunday");
        }
    }
}













