package students.student_zanna_klimova.lesson_5.level_2;

public class RandomArrayPlusTwo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int)(Math.random() * 100));
            System.out.println(numbers[i]);
        }
        System.out.println("_________________________________");
        System.out.println((numbers[0] + 2));
        System.out.println((numbers[1] + 2));
        System.out.println((numbers[2] + 2));
    }
}
