package students.student_oskars_popens.lesson_4.level_1_intern;

import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inNumber;

        System.out.println("Please enter integer number:");
        inNumber = sc.nextInt();

        if ( inNumber%2 == 0 ){
            System.out.println("Entered number " + inNumber + " is even");
        } else {
            System.out.println("Entered number " + inNumber + " is odd");
        }
    }
}
