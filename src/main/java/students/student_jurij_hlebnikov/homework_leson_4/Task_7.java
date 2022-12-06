package students.student_jurij_hlebnikov.homework_leson_4;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args){

        System.out.println("Please Give Two Numbers:");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if(numberOne == numberTwo){
            System.out.println("Numbers are equals");
        }else {
            System.out.println("Numbers are different");
        }
    }
}
