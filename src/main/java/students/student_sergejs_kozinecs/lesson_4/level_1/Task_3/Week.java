package students.student_sergejs_kozinecs.lesson_4.level_1.Task_3;

import java.util.Scanner;

class Week {
    static String isDayOfTheWeek(int day) {
        switch (day) {
            case 1: {
                return "Monday";
            }
            case 2: {
                return "Tuesday";
            }
            case 3: {
                return "Wednesday";
            }
            case 4: {
                return "Thursday";
            }
            case 5: {
                return "Friday";
            }
            case 6: {
                return "Saturday";
            }
            case 7: {
                return "Sunday";
            }
            default: {
                return "Wrong input";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter day of the week:");
        String isDayOfTheWeek = isDayOfTheWeek(scanner.nextInt());

        System.out.println(isDayOfTheWeek);

        scanner.close();
    }
}
