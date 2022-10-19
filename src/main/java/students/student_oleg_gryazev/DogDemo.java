package students.student_oleg_gryazev;
import java.util.Scanner;
public class DogDemo {
    public static void main(String[] args) {
        Dog myObj = new Dog();
        myObj.setName(" My name is Reks"); // Set the value of the name variable to "reks"
        System.out.println(myObj.getName());

        Dog myDog = new Dog(1);
        int realAge = myDog.getAge();
        System.out.println("I am = " + realAge + " year");

        Dog voiceDog = new Dog();
        System.out.println("Reks, Voice!");
        System.out.println(myObj.getName() + " and I am = " + realAge + " year");

        Dog happyBirthday = new Dog();
        System.out.println("Hi Reks! Happy birthday to you! How old are you now? I am ");
        System.out.println(realAge + 1 + " years old");

        Dog changeColor = new Dog();
        String[] color = {"White", "Black", "White"};
        System.out.println("Hi Reks! would you like to change your body colour? Yes I'd! Great. Its simple. Just push buttons to choose color:\n " +
                " 1 is green\n2 is red\n3 is white\n4 is black ");

        Scanner coloring = new Scanner(System.in);
        System.out.println("Enter color");
        String x = coloring.nextLine();
        //int i;
        Integer i = Integer.parseInt(x);

        switch (x) {
            case  ("1"):
                System.out.println("You are green now!");
                break;
            case ("2"):
                System.out.println("You are red now!");
                break;

            case ("3"):
                System.out.println("You are white now!");
                break;
            case ("4"):
                System.out.println("You are black now!");
                break;
            default:
                System.out.println("I don't want to change my color");
                break;


        }
    }
}
