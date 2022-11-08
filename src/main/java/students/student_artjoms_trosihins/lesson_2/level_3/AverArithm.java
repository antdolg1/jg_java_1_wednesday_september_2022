package students.student_artjoms_trosihins.lesson_2.level_3;

import java.util.Scanner;

class AverArithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberOne;
        double numberTwo;
        double numberThree;
        System.out.println("Please, enter three numbers");
        numberOne = sc.nextDouble();
        numberTwo = sc.nextDouble();
        numberThree = sc.nextDouble();
        System.out.print("Average arithmetic is " + ((numberOne + numberTwo + numberThree) / 3));
    }

}
