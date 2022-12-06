package students.student_jurij_hlebnikov.homework_leson_4;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        System.out.println("Please give me three numbers:");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree){
            System.out.println(numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo);
        } else if (numberThree > numberOne && numberThree > numberOne) {
            System.out.println(numberThree);
        }

    }
}
