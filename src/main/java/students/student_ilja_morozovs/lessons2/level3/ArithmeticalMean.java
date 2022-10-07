package students.student_ilja_morozovs.lessons2.level3;

import java.util.Scanner;

public class ArithmeticalMean {
    int numberOne;
    int numbertwo;
    int numberthree;
    double result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticalMean arithmeticalMean = new ArithmeticalMean();
        System.out.println("Enter number one: ");
        arithmeticalMean.numberOne = scanner.nextInt();
        System.out.println("Enter number two: ");
        arithmeticalMean.numbertwo = scanner.nextInt();
        System.out.println("Enter number three: ");
        arithmeticalMean.numberthree = scanner.nextInt();
        arithmeticalMean.result = (arithmeticalMean.numberthree + arithmeticalMean.numbertwo + arithmeticalMean.numberthree) / 2;
        System.out.println("Arithmetical mean is: " + arithmeticalMean.result);
    }
}

