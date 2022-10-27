package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_12;

class RandomNumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int randomNumbers : numbers) {
            randomNumbers = (int) (Math.random() * numbers.length);
            System.out.println("Random number is: " + randomNumbers);
        }
    }
}
