package students.student_ignat_parfenov;

public class DogDemo {
     public static void main(String[] args) {

         Dog firstDog = new Dog();
         firstDog.name = "Bob";
         firstDog.age = 6;
         firstDog.isBig = true;
         firstDog.color = "black";

         System.out.println("My dogs name is: " + firstDog.name);
         System.out.println("My dogs age is: " + firstDog.age);
         System.out.println("My dogs is: " + firstDog.isBig);
         System.out.println("My dogs color is: " + firstDog.color);

         firstDog.age = 7;

         System.out.println("My dogs age is : " + firstDog.age);

         Dog secondDog = new Dog("Susan", 12, false, "white");

         System.out.println("My dogs name is: " + secondDog.name);
         System.out.println("My dogs age is: " + secondDog.age);
         System.out.println("My dogs is: " + secondDog.isBig);
         System.out.println("My dogs color is: " + secondDog.color);
     }
}
