package students.student_konstantin_karetnikov.lesson_5.level_2;


public class ArrayThreeNumbersRandom {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() *  2147483647);
        numbers[1] = (int) (Math.random() *  2147483647);
        numbers[2] = (int) (Math.random() *  2147483647);



        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
    }
}
