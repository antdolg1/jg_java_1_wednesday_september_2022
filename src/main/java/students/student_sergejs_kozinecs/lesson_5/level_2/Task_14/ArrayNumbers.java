package students.student_sergejs_kozinecs.lesson_5.level_2.Task_14;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
            sum += number;
        }

        System.out.println("Sum is: " + sum);
    }
}
