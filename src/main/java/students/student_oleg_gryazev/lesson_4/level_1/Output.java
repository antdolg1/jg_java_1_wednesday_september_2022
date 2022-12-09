package students.student_oleg_gryazev.lesson_4.level_1;

import java.util.Scanner;

 class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any int number");
        int x = scanner.nextInt();
        if (x>0){
        System.out.println("Number is positive and = " + x);
        if (x % 2 == 0){
                System.out.println("The number " + x + " is even.");
            }
        }
       else if (x==0){
           System.out.println("0 is entered ");
       }
           else if (x <= -1 ) {System.out.println("Number is negative and = " + x);
           if (x % 2 == 0) {
               System.out.println("The number " + x + " is even.");
           }
       }
    }
}

class DayWeekOutput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of day week");
        int numberDW = scanner.nextInt();
        switch (numberDW) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
            case 3:
                System.out.println("Today is Wednesday");
            case 4:
                System.out.println("Today is Thursday");
            case 5:
                System.out.println("Today is Friday");
            case 6:
                System.out.println("Today is Saturday");
            case 7:
                System.out.println("Today is sunday");
        }
    }

}
