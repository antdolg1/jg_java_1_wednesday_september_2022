package students.student_danila_kolesnicenko.lesson5;

import java.util.Scanner;

class ArrayWithThreeNumbers2 {

    public static void main(String[] args) {


        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }


    }
}
