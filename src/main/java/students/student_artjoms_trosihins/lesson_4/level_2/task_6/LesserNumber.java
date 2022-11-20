package students.student_artjoms_trosihins.lesson_4.level_2.task_6;

import java.util.Scanner;

class LesserNumber {
    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter two numbers:");

        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();

        if (numberOne < numberTwo) {
            System.out.print("Lesser number is " + numberOne);
        } else {
            System.out.print("Lesser number is " + numberTwo);
        }
    }
}
