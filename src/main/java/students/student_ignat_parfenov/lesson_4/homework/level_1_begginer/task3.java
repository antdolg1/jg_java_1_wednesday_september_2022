package students.student_ignat_parfenov.lesson_4.homework.level_1_begginer;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args){

        System.out.println("Please enter any number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();

        if (number2 == 1){
            System.out.println("Monday");
        } else if (number2 == 2) {
            System.out.println("Tuesday");
        } else if (number2 == 3) {
            System.out.println("Wednesday");
        } else if (number2 == 4) {
            System.out.println("Thursday");
        } else if (number2 == 5) {
            System.out.println("Friday");
        } else if (number2 == 6) {
            System.out.println("Saturday");
        } else if (number2 == 7) {
            System.out.println("Sunday");
        } else{
            System.out.println("Please enter requested number! from 1 till 7!!");
        }
    }
}
