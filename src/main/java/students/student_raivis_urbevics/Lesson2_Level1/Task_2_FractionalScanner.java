package students.student_raivis_urbevics.Lesson2_Level1;

import java.util.Scanner;

public class Task_2_FractionalScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the first double");
        double n1 = scanner.nextDouble();
        System.out.println("Input the second double");
        double n2=scanner.nextDouble();
        double sum=n1+n2;
        double subtract=n1-n2;
        double division=n1*n2;
        double multiply=n1/n2;
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(division);
        System.out.println(multiply);
    }
}
