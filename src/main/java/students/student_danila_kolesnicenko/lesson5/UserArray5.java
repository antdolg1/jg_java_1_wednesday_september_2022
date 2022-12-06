package students.student_danila_kolesnicenko.lesson5;

class UserArray5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 67);
            System.out.println(array[i]);
        }
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }
}


