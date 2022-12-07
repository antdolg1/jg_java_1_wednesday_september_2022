package teacher.lesson_10.lessoncode;

public class BeforeEnums {

    public static void main(String[] args) {

        DayOfTheWeek day = DayOfTheWeek.WEDNESDAY;

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY -> System.out.println("I don't wanna work!");
            case THURSDAY -> System.out.println("Two days left");
            case FRIDAY -> System.out.println("Finally friday");
        }

    }

}
