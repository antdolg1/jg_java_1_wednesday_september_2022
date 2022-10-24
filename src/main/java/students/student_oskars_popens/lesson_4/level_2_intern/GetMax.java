package students.student_oskars_popens.lesson_4.level_2_intern;

import java.util.Scanner;

class GetMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Please enter 1-st number:");
        number1 = sc.nextInt();
        System.out.println("Please enter 2-nd number:");
        number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println("1-st number (" + number1 + ") is bigger ");
        } else if (number1 < number2){
            System.out.println("2-nd number (" + number2 + ") is bigger ");
        } else {
            System.out.println("1-st and 2-nd number is equal (" + number1 + ")");
        }
    }
}
