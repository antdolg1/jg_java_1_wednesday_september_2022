package students.student_mihhail_karasjov.Lesson4.Homework.Level1;
import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args){
        int num;
        System.out.println("Please enter the number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
        else
            System.out.println("Number is odd");
    }
}
