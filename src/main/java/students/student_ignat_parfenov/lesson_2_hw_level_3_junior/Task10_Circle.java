package students.student_ignat_parfenov.lesson_2_hw_level_3_junior;

import java.util.Scanner;

public class Task10_Circle {public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Test Data: " + "\nRadius = ");
    double yourRadius = scanner.nextDouble();

    System.out.println("Perimeter is = " + 2*Math.PI*yourRadius);
    System.out.println("Area is = " + yourRadius*yourRadius*Math.PI);

}
}
