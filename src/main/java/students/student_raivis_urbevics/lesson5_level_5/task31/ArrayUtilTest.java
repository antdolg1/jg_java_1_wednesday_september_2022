package students.student_raivis_urbevics.lesson5_level_5.task31;
     class ArrayUtilTest {
         public static void main(String[] args) {
             ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
             arrayUtilTest.shouldCreateArray();


         }

         void shouldCreateArray() {
             ArrayUtil arrayUtil = new ArrayUtil();
             int expectedArrayLength = 5;
             int[] realResult = arrayUtil.createArray(5);
             testArrayLength(realResult, expectedArrayLength);

         }

         void testArrayLength(int[] realResult, int arrayLength) {
             if (realResult.length == arrayLength) {
                 System.out.println("Test Array Length = OK");
             } else {
                 System.out.println("Test Array Length = FAIL");

             }
         }
     }
