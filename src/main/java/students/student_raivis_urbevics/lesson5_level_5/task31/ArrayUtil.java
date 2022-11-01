package students.student_raivis_urbevics.lesson5_level_5.task31;
     class ArrayUtil {


         public int[] createArray(int arrayLength) {
             return new int[arrayLength];

         }

         public void fillArrayWithRandomNumbers(int[] array) {
             for (int i = 0; i < array.length; i++) {
                 array[i] = ((int) (Math.random() * 100));
             }
         }
     }
