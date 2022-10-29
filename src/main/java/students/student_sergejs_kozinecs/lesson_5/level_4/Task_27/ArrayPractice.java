package students.student_sergejs_kozinecs.lesson_5.level_4.Task_27;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        int[] numbers = new int[10];
        int highestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            if (highestNumber < numbers[i]) {
                highestNumber = numbers[i];
            }
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }

        System.out.println("Highest number is: " + highestNumber);
    }
}
