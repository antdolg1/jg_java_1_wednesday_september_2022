package students.student_sergejs_kozinecs.lesson_5.level_2.Task_15;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number is: " + numbers[i]);
            numbers[i] += 2;
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }
    }
}