package students.student_oleg_gryazev.lesson_4.level_3;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int z = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (z == y && x == y) {
            System.out.println("All numbers are equal");
        }
        if (x != z && z != y && x != y) {
            System.out.println(" All numbers are not equal");
        } else {
            System.out.println("nor equal nor");
        }
    }
}
class Output1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int z = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (z > x & x > y){
            System.out.println("Numbers are in decreasing order");}
        else if (z < x & x < y) {
            System.out.println("Numbers are in increasing order");}
else {
        System.out.println("nor increasing nor decreasing");
            }
        }
    }
class Output2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int z = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (z > x && z > y) {
            System.out.println("first entered number" + z + " is largest number");
        } else if (x > z && x > y) {
            System.out.println("second entered number" + x + " is largest number");
        } else if (y > z && y > x) {
            System.out.println("third entered number " + y + " is largest number");
        } else {
            System.out.println("Numbers are equal or smth else");
        }
    }
}