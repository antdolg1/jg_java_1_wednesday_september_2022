package students.student_oleg_gryazev.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

 class ArrayUtil {
           public  int[] createArray(int massiveCreatedlenght) {
               int[] massiveCreated = new int[massiveCreatedlenght];
               Random random = new Random();
               for (int i = 0; i < massiveCreated.length; i++) {
                   massiveCreated[i] = random.nextInt(100);
               }
               return massiveCreated;
                      }
               }
               class ArrayUtilTest {
                   public static void main(String[] args) {
                       ArrayUtilTest test = new ArrayUtilTest();
                       ArrayUtil arrayUtil = new ArrayUtil();
                       arrayUtil.createArray(5);
                       test.shouldCreateArray();
                   }
                   public void shouldCreateArray() {
                       ArrayUtil arrayUtil = new ArrayUtil();
                       int[] expectedResult = new int[5];
                       int[] actualResult = arrayUtil.createArray(5);
                       if (Arrays.equals(new int[]{expectedResult.length}, new int[]{actualResult.length})) {
                           System.out.println("Test passed");
                       } else {
                           System.out.println("Test !passed");
                       }
                       System.out.println();
                       System.out.println("Empty massive " + Arrays.toString(expectedResult) + "\n MassiveCreated" + Arrays.toString(actualResult));
                   }
               }

