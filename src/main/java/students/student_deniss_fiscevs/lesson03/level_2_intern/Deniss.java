package students.student_deniss_fiscevs.lesson03.level_2_intern;

import java.util.Scanner;

public class Deniss {

    public static void main(String [] args) {

        String myName = "Deniss";
        System.out.println(myName);
        System.out.println("Hi, " + myName + "!");

        System.out.println("______________________________");

        System.out.println("Hello, what is your name?");

        String userName;

        Scanner myScanner = new Scanner(System.in);
        userName = myScanner.next();

        System.out.println("Hello " + userName);
    }

}
