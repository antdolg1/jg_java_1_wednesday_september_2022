package students.student_konstantin_karetnikov.lesson_5.level_2;


public class ArrayThreeNumbersRandomSum {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() *  100);
        numbers[1] = (int) (Math.random() *  100);
        numbers[2] = (int) (Math.random() *  100);
        int sumNumbers = numbers[0] + numbers[1] + numbers[2];
        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
        System.out.println("_________________________");
        System.out.println("Sum of all elements in numbers[] is: " + sumNumbers);




    }
}
