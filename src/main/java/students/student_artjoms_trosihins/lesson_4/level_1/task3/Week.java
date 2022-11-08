package students.student_artjoms_trosihins.lesson_4.level_1.task3;

import java.util.Scanner;

class Week {
    public static void main(String[] args) {

        System.out.println("Hello! Please, enter the number from 1 to 7");

        Scanner scani = new Scanner(System.in);
        int dayNumber = scani.nextInt();

        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("We have only 7 days in a week, sorry!");
        }
    }
}
