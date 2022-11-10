package students.student_konstantin_karetnikov.lesson_5.level_4;

class ArrayRandomOdd {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("numbers[] elements: ");
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println("\n");
        System.out.println("_______________________________________");
        System.out.println("Odd numbers is: ");

        for (int oddNumber : numbers) {
            if (oddNumber % 2 != 0) {
                System.out.print(" " + oddNumber);
            }
        }
    }
}
