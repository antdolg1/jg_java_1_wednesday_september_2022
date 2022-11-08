package students.student_artjoms_trosihins.lesson_2.level_3;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double rad = sca.nextDouble();
        System.out.println("Perimeter is " + (2 * rad * Math.PI));
        System.out.println("Area is " + (Math.PI * rad * rad));
    }
}
