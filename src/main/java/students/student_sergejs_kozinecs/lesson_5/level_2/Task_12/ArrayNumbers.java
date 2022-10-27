package students.student_sergejs_kozinecs.lesson_5.level_2.Task_12;

class ArrayNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 9999) + 1;
        }

        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }
    }
}
