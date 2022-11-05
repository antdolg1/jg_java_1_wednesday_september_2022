package students.student_stivens_veveris.lesson5.level4;

import java.util.Random;

class Array27 {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println("Array elements are: " + numbers[i]);
        }

        int maxNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
                System.out.println("---------------------------------");
                System.out.println("Highest array element number is: " + maxNumber);
            }
        }
    }
}
