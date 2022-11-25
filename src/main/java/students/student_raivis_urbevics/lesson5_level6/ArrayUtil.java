package students.student_raivis_urbevics.lesson5_level6;

import java.util.Arrays;

   class ArrayUtil {

       public int[] createArray(int arrSize) {
           return new int[arrSize];
       }

       public void printArrayToConsole(int[] array) {
           System.out.println("Array = ");
           for (int printArr : array) {
               System.out.println(printArr);
           }
       }

       public int findMaxNumber(int[] array) {

           int maxNumber = array[0];
           for (int i = 0; i < array.length; i++) {
               if (array[i] > maxNumber) {
                   maxNumber = array[i];

               }
           }
           return maxNumber;
       }

       public int findMinNumber(int[] array) {

           int minNumber = array[0];
           for (int i = 0; i < array.length; i++) {
               if (array[i] < minNumber) {
                   minNumber = array[i];
               }
           }
           return minNumber;
       }
   }
