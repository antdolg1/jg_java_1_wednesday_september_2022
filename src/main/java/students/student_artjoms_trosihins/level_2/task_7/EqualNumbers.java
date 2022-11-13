package students.student_artjoms_trosihins.level_2.task_7;

import java.util.Scanner;

class EqualNumbers {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter two numbers :");

        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();

        if (numberOne == numberTwo) {
            System.out.print("Numbers are equals!");
        } else {
            System.out.print("Numbers are different!");
        }
    }
}
