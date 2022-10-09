package students.student_konstantin_karetnikov;
import java.util.Scanner;

public class PerimeterArea {
    public static void main(String[] args) {
        double Number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Radius: ");
        Number = scanner.nextDouble();


        System.out.println("Perimeter is = " + (2 * Number * Math.PI));
        System.out.println("Area is = " + (Math.PI * Math.pow(Number, 2)));


    }

    }
