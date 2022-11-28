package students.student_artjoms_trosihins.lesson_4.level_3.task_9;

import java.util.Scanner;

class IncreaseOrDecreaseNumbers {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        int numberThree;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers, user!");
        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();
        numberThree = sc.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
