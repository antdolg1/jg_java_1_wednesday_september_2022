package students.student_danila_kolesnicenko;

import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double usernumber;

        System.out.print("Please enter your number: ");
        usernumber = scanner.nextDouble();

        System.out.println("Perimeter is = " + usernumber * 2 * 3.14);
        System.out.println("Area is = " + 3.14 * usernumber * usernumber);

    }
}
