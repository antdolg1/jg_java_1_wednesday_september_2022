package teacher.lesson_10.lessoncode;

public class SeasonApp {

    public static void main(String[] args) {

        Season season = Season.WINTER;
        System.out.println(season.getMonthNames());

        System.out.println(season.name());
        System.out.println(season);

        System.out.println(season.equals(season.name()));

//        switch (season) {
//            case WINTER -> System.out.println("December, January, February");
//            case SPRING -> System.out.println("March, April, May");
//            case SUMMER -> System.out.println("June, July, August");
//            case AUTUMN -> System.out.println("September, October, November");
//        }
//
//        System.out.println(season instanceof Enum);

        //SeasonApp extends Object

        //Season extends Enum extends Object

    }

}
