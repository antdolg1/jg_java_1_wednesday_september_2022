package students.student_zanna_klimova.lesson_4.level_3;

import java.util.Scanner;

 class BiggestNumber {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three whole numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("_____________________________");
            System.out.println("The biggest number is: " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("___________________________________");
            System.out.println("The biggest number is: " + numberTwo);
        } else if (numberOne == numberTwo & numberThree > numberOne){
            System.out.println("_________________________________");
            System.out.println("The biggest number is: " + numberThree);
        } else {
            System.out.println("________________________________");
            System.out.println("The biggest number is: " + numberThree );
        }
    }
}
