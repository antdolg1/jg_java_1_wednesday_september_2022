package students.student_deniss_fiscevs.lesson06.level_2_intern;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

//        (!) we're creating own method, with the DayOfTheWeekDetector.
//        The same as preinstalled method Scanner.

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }

}