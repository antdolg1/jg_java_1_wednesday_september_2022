package students.student_oskars_popens.lesson_4.level_1_intern;

import java.util.Scanner;

// Task_1 & Task_2
class CeckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber;

        System.out.println("Please enter an integer number:");
        inputNumber = sc.nextInt();
        if (inputNumber < 0){
            System.out.println("Entered number is less than zero");
        } else if (inputNumber == 0) {
            System.out.println("Entered number is zero");
        }
        else {
            System.out.println("Entered number is greater than zero");
        }
    }
}
