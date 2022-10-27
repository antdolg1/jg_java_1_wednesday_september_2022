package students.student_konstantin_karetnikov.lesson_2;
import java.util.Scanner;public class PerimeterArea {
    public static void main(String[] args) {
        double number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Radius: ");
        number = scanner.nextDouble();
        System.out.println("Perimeter is = " + (2 * number * Math.PI));
        System.out.println("Area is = " + (Math.PI * Math.pow(number, 2)));
    }
    }
