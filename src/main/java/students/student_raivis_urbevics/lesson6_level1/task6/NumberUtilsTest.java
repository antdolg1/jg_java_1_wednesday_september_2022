package students.student_raivis_urbevics.lesson6_level1.task6;

  class NumberUtilsTest {
      public static void main(String[] args) {
          NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
          numberUtilsTest.isEvenTest();

      }
           void isEvenTest() {
          NumberUtils numberUtils = new NumberUtils();
          if (numberUtils.isEven(11)) {
              System.out.println("Is Even Test = OK");
          } else {
              System.out.println("Is Even Test = FAIL");
          }
      }
  }
