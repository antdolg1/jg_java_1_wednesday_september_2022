package students.student_ilja_morozovs.lesson_3.homework.level_5.Task_22;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Red");
        Scanner scanner = new Scanner(System.in);
        dog.dogVoice();
        System.out.println("What color do you want??? :");
        String newColor = scanner.nextLine();
        dog.changeColor(newColor);
        dog.dogVoice();
        System.out.println("You change dog color,new color is : " + dog.dogColor);
    }
}
