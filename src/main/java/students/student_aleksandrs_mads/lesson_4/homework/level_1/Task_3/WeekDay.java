package students.student_aleksandrs_mads.lesson_4.homework.level_1.Task_3;

import java.util.Scanner;

class WeekDay {
    public static void main(String[] args) {
        int numberWeekDay;
        System.out.println("Enter number of the day week 1-7: ");
        Scanner scanner = new Scanner(System.in);
        numberWeekDay = scanner.nextInt();
        if (numberWeekDay == 1) {
            System.out.println("Monday");
        } else if (numberWeekDay == 2) {
            System.out.println("Tuesday");
        } else if (numberWeekDay == 3) {
            System.out.println("Wednesday");
        } else if (numberWeekDay == 4) {
            System.out.println("Thursday");
        } else if (numberWeekDay == 5) {
            System.out.println("Friday");
        } else if (numberWeekDay == 6) {
            System.out.println("Saturday");
        } else if (numberWeekDay == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Days of the week only 7");
        }


    }

}

