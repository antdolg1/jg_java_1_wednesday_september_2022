package students.student_vladislav_saksin.lesson_5.homework.level_2;

class Task14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() * 10);
        numbers[1] = (int) (Math.random() * 10);
        numbers[2] = (int) (Math.random() * 10);

        System.out.println((numbers[0] + numbers[1] + numbers[2]) / 3);
    }

}
