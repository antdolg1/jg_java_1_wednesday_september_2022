package students.student_mihhail_karasjov.lesson_2_level_3;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=s.nextInt();
        for(int i=1; i<= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
