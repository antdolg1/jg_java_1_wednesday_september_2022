package students.student_raivis_urbevics.Lesson_2_Level1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the first number");
        int n1=scanner.nextInt();
        System.out.println("Input the second number");
        int n2=scanner.nextInt();
        int sum=n1+n2;
        int subtract=n1-n2;
        int division=n1/n2;
        int multiply=n1*n2;
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(division);
        System.out.println(multiply);
     }
}
