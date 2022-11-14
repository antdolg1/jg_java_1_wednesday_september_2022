package students.student_artjoms_trosihins.level_3.task_10;

import java.util.Scanner;

class BiggerNumberThree {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;
        int numberThree;
        Scanner sca = new Scanner(System.in);

        System.out.println("Please, enter three numbers!");

        numberOne = sca.nextInt();
        numberTwo = sca.nextInt();
        numberThree = sca.nextInt();

        if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("The biggest number is " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("The biggest number is " + numberTwo);
        } else {
            System.out.println("The biggest number is " + numberThree);
        }
    }
}
