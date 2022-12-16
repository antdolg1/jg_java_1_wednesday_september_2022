package students.student_zanna_klimova.lesson_6.level_3;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9, 11, 3};
        ArrayService arrayService = new ArrayService();
        System.out.println("______________________________________");
        arrayService.contains(arr, 5);
        System.out.println("______________________________________");
        arrayService.countOccurrences(arr, 3);
        System.out.println("______________________________________");
        System.out.println(arrayService.replaceFirst(arr, 7, 100));
        System.out.println("________________________________________");
        arrayService.replaceFirst(arr, 9, 33);
        arrayService.replaceAll(arr, 19, 555);
        System.out.println("______________________________________");
        arrayService.revert(arr);
        arrayService.sort(arr);
    }
}
