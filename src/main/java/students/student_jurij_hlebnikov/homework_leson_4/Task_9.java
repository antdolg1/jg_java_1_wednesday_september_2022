package students.student_jurij_hlebnikov.homework_leson_4;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){

        System.out.println("Please give me Three numbers:");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if( numberOne < numberTwo && numberTwo < numberThree){
            System.out.println("Increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("Decreasing");
        } else if (numberOne > numberTwo && numberOne < numberThree || numberTwo > numberOne && numberTwo < numberThree || numberThree < numberTwo && numberThree < numberOne) {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
