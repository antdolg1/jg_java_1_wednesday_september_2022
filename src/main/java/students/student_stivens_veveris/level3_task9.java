package students.student_stivens_veveris;

import java.util.Scanner;

public class level3_task9 {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter whole number: ");
        number = scanner.nextInt();
        System.out.println("______________");
        System.out.println(" ");

        int one = number * 1;
        int two = number * 2;
        int three = number * 3;
        int four = number * 4;
        int five = number * 5;
        int six = number * 6;
        int seven = number * 7;
        int eight = number + 8;
        int nine = number * 9;
        int ten = number * 10;

        System.out.println(number + " * 1 = " + one);
        System.out.println(number + " * 2 = " + two);
        System.out.println(number + " * 3 = " + three);
        System.out.println(number + " * 4 = " + four);
        System.out.println(number + " * 5 = " + five);
        System.out.println(number + " * 6 = " + six);
        System.out.println(number + " * 7 = " + seven);
        System.out.println(number + " * 9 = " + nine);
        System.out.println(number + " * 10 = " + ten);

    }
}
