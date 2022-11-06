package students.student_oleg_gryazev.lesson_5.level_2;


import java.util.Scanner;

 class Level_2 {                              // Task 10

    public static void main(String[] args) {
        int[] numbers = new int[3];
       numbers[0] = 1;
       numbers[1] = 2;
       numbers[2] = 3;

        System.out.println("0 position is number " + numbers[0] + "\n 1 position is number " + numbers[1] + "\n2 position is number " + numbers[2]);
//////////////////////////////////////////////////
        int[] number = new int[3];                  // Task 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        number[0] = scanner.nextInt();
        System.out.println("0 position is number " + number[0]);


        number[1] = scanner.nextInt();
        System.out.println("1 position is number " + number[1]);

        number[2] = scanner.nextInt();
        System.out.println("2 position is number " + number[2]);
/////////////////////////////////////////////////////
        double[] num = new double[3];                  // Task 12
        int lenght = -1;

            do {
                //double a = Math.random();
                lenght++;
                if (lenght == 0) {
                    double a = Math.random()*1000;
                    num[0] = a;
                    System.out.println(num[0]);
                } else if (lenght == 1) {
                    double a = Math.random()*1000;
                    num[1] = a;
                    System.out.println(num[1]);
                } else {
                    double a = Math.random()*1000;
                    num[2] = a;
                    System.out.println(num[2]);
                }
            }while (lenght < 2);
  /////////////////////////////////////////////////  Task 13
        double[] num1 = new double[3];

        double a = Math.random()*1000;
        num1[0] = a;
        double b = Math.random()*1000;
        num[1] = b;
        double c = Math.random()*1000;
        num[2] = c;

        System.out.print("Sum of each num1 element = ");
        System.out.print(num1[0] + num1[1] + num1[2]);

////////////////////////////////////////////////   Task 14
        double[] num2 = new double[3];

        double x = Math.random()*1000;
        num2[0] = x;
        System.out.println();
        double y = Math.random()*1000;
        num2[1] = y;
        double z = Math.random()*1000;
        num2[2] = z;
        System.out.print("\nMedium value of three elements = " + (num2[0] + num2[1] + num2[2])/3);
///////////////////////////////////////////        Task 15

        double[] num3 = new double[3];

        double k = Math.random()*1000;
        num3[0] = k;
        System.out.println("\n\nCurrent state of 0 element = " + num3[0]);
        num3[0] = num3[0] + 2;
        System.out.println("Current state of 0 element + 2 = " + num3[0]);


        System.out.println();
        double l= Math.random()*1000;
        num3[1] = l;
        System.out.println("\nCurrent state of 1 element = " + num3[1]);
        num3[1] = num3[1] + 2;
        System.out.println("Current state of 1 element + 2 = " + num3[1]);


        double m = Math.random()*1000;
        num3[2] = m;
        System.out.println("\nCurrent state of 0 element = " + num3[2]);
        num3[2] = num3[2] + 2;
        System.out.println("Current state of 0 element + 2 = " + num3[2]);

    }
}







