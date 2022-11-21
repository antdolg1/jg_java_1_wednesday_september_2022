package students.student_artjoms_trosihins.lesson_5.level_4.task_27;


import java.util.Arrays;
import java.util.Random;

class MaxRandomArray {

 public static void main(String[] args) {

  Random random = new Random();

  int[] numbers = new int[9];

  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = random.nextInt(1000);
  }
  System.out.println("Array elements : " + Arrays.toString(numbers));

  int maxNumber = numbers[0];

  for (int i = 0; i < numbers.length; i++) {
   if (numbers[i] > maxNumber) {
    maxNumber = numbers[i];
   }
  }
  System.out.println("Max number is " + maxNumber);
 }
}
