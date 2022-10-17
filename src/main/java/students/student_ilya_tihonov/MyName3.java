package students.student_ilya_tihonov;

import java.util.Scanner;

public class MyName3 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String str = in.nextLine();
        System.out.println("Hello " + str + "!");

    }

}
