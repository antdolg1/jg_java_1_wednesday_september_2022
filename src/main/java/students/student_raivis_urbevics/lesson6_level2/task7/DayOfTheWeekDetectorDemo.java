package students.student_raivis_urbevics.lesson6_level2.task7;

    class DayOfTheWeekDetectorDemo {
        public static void main(String[] args) {
            DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
            int dayNumber = detector.getDayNumberFromUser();
            String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
            System.out.println(dayOfTheWeek);
        }
    }
