package students.student_deniss_fiscevs.lesson05.level_2_intern;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] number = new int[3];
        System.out.println("Please, enter a number:");
        number[0] = scanner.nextInt();
        System.out.println("Please, enter another number:");
        number[1] = scanner.nextInt();
        System.out.println("And the last number:");
        number[2] = scanner.nextInt();
        System.out.println("First number = " + number[0]);
        System.out.println("Second number = " + number[1]);
        System.out.println("Third number = " + number[2]);
    }

}
