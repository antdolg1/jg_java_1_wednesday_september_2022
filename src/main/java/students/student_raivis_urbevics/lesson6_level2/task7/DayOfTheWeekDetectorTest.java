package students.student_raivis_urbevics.lesson6_level2.task7;

  class DayOfTheWeekDetectorTest {
      public static void main(String[] args) {
          DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
          dayOfTheWeekDetectorTest.shouldReturnMonday();
          dayOfTheWeekDetectorTest.shouldReturnTuesday();
          dayOfTheWeekDetectorTest.shouldReturnWednesday();
          dayOfTheWeekDetectorTest.shouldReturnThursday();
          dayOfTheWeekDetectorTest.shouldReturnFriday();
          dayOfTheWeekDetectorTest.shouldReturnSaturday();
          dayOfTheWeekDetectorTest.shouldReturnSunday();
          dayOfTheWeekDetectorTest.shouldReturnNotCorrectDayNumber();


      }

      public void shouldReturnMonday() {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(1);
          checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
      }

      public void shouldReturnTuesday() {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(2);
          checkTestResult("Tuesday".equals(dayOfTheWeek),"Tuesday");
      }

      public void shouldReturnWednesday () {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(3);
          checkTestResult("Wednesday".equals(dayOfTheWeek),"Wednesday");
      }

      public void shouldReturnThursday () {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(4);
          checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
      }

      public void shouldReturnFriday() {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(5);
          checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
      }

      public void shouldReturnSaturday() {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(6);
          checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
      }

      public void shouldReturnSunday() {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(7);
          checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
      }

      public void shouldReturnNotCorrectDayNumber() {
          DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
          String dayOfTheWeek = detector.findDayOfTheWeek(9);
          checkTestResult("Not correct day number".equals(dayOfTheWeek),"Not correct day number");
      }

      private void checkTestResult(boolean condition, String testName) {
          if (condition) {
              System.out.println(testName + " = OK!");
          } else {
              System.out.println(testName + " = FAIL!");
          }
      }
  }
