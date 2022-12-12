package students.student_zanna_klimova.lesson_5.level_4;

public class OddNumbersOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int)(Math.random() * 100));
            System.out.println(numbers[i]);
        }
        System.out.println("__________________________");
        for(int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) != 0) {
                System.out.println(numbers[i] + " is odd number.");
            }
        }
    }
}
