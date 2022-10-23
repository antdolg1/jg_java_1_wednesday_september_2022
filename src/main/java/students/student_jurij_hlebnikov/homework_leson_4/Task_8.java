package students.student_jurij_hlebnikov.homework_leson_4;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("Please Give Three Numbers:");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if(numberOne == numberTwo && numberTwo == numberThree){
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree && numberOne != numberThree) {
            System.out.println("All numbers are different");
        } else if (numberOne == numberTwo && numberOne != numberThree || numberTwo == numberThree && numberOne != numberThree || numberOne == numberThree) {
            System.out.println("Neither all are equal or different");
        }
    }
}
