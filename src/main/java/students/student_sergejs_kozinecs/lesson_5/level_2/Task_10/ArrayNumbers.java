package students.student_sergejs_kozinecs.lesson_5.level_2.Task_10;

class ArrayNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 15;
        numbers[1] = 24;
        numbers[2] = 34;
        
        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }
    }
}
