package students.student_oleg_gryazev.lesson_4.level_3;

import java.util.Scanner;

class Numbers {
    Numbers(){
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x > y && x > z) {                                   //Comparing   Max Number!
            System.out.println("наибольшее число x == " + x);
        }
        else if (y > x && y > z) {
            System.out.println("наибольшее число y == " + y);
        }
        else if (z > x && z > y) {
            System.out.println("наибольшее число z == " + z);
        }
        else if ((z == y) && (x == y)){
            System.out.println("All numbers are equal ");
        }
        else System.out.println("Neither all are equal or different otherwise. " );

        if ((y < x && y > z)) {
            System.out.println("Numbers in decreasing order");  //Comparing in/decrease order
        }
        else if (x < y && x < z) {
            System.out.println("Numbers in increasing order");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}

