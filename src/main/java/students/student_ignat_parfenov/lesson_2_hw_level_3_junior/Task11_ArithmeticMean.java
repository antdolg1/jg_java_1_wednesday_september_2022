package students.student_ignat_parfenov.lesson_2_hw_level_3_junior;

import java.util.Scanner;

public class Task11_ArithmeticMean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first numbers : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter your second number : ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter your third number : ");
        double num3 = scanner.nextDouble();

 //       double[] nums = new double[]{num1, num2, num3};
 //       for (double m : nums) {  // Вопрос, Антон. Как ввести не просто цифру 3 (количество цифр) ниже в строке sout,
 //       }                        //а именно длину nums.lenght чтобы система автоматически выполняла деление суммы
                                    //на кол-во введенных значений вверху? for не подходит... а что?
 //       System.out.println("Arithmetic mean is = " + (num1 + num2 + num3) / nums.length);

        System.out.println("Arithmetic mean is = " + (double)(num1 + num2 + num3)/3);
    }
}


