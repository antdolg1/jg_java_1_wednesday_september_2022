package students.student_mihhail_karasjov.Lesson_2.Homework.Level_3;

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
