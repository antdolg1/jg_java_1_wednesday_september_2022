package students.student_zanna_klimova.lesson_5.level_4;

public class SmallestNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int)(Math.random() * 100));
            System.out.println(numbers[i]);
        }
        int minNumber = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("_________________________");
        System.out.println("The largest number is: " + minNumber);
    }
}
