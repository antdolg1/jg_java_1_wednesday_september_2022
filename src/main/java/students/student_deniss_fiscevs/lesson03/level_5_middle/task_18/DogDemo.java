package students.student_deniss_fiscevs.lesson03.level_5_middle.task_18;

import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {


        System.out.println("Hi! You've got a dog! How do you call it?");

        Scanner dogsScanner = new Scanner(System.in);
        String dogsName = dogsScanner.next();

        Dog firstDog = new Dog();
        firstDog.name = dogsName;

        System.out.println("Cool! Dog's name is " + firstDog.name + "!");

        firstDog.voice();

    }
}
