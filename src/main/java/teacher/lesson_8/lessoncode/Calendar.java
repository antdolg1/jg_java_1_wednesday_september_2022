package teacher.lesson_8.lessoncode;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Calendar {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.now();
        String monthName = date.getMonth().name();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); //set start of the month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 - Monday, 2 - Tuesday...

        System.out.println();
        System.out.println(monthName);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }


    }

}


//3%d
//% - print variable here
//d - variable of type int
//3 - use at least 3 characters to display number, if needed fill with empty spaces
