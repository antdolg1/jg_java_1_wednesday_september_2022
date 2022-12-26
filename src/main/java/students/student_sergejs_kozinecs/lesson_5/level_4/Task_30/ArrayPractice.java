package students.student_sergejs_kozinecs.lesson_5.level_4.Task_30;

class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int lowestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            if (i == 0) {
                lowestNumber = numbers[i];
            }
            if (lowestNumber > numbers[i]) {
                lowestNumber = numbers[i];
            }
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }

        for (int number : numbers) {
            if (number % 2 == 1) {
                System.out.println("Even number is: " + number);
            }
        }
    }
}
