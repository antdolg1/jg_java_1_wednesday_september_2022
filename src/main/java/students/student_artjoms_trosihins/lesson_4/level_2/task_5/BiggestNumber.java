package students.student_artjoms_trosihins.lesson_4.level_2.task_5;

import java.util.Scanner;

class BiggestNumber {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter two numbers:");

        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();

        if (numberOne > numberTwo) {
            System.out.print("Bigger number is " + numberOne);
        } else {
            System.out.print("Bigger number is " + numberTwo);
        }
    }
}
