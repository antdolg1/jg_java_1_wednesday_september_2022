package students.student_mihhail_karasjov.lesson2;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args){
        System.out.println("Please enter your name: ");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello " + name);
    }
}
