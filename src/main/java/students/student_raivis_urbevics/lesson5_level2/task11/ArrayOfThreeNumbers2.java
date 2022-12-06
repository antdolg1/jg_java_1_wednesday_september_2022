package students.student_raivis_urbevics.lesson5_level2.task11;

import java.util.Scanner;

         class ArrayOfThreeNumbers2 {
        public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        System.out.println("Input the third number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        int[]numbers=new int[3];
        numbers[0]=num1;
        numbers[1]=num2;
        numbers[2]=num3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
