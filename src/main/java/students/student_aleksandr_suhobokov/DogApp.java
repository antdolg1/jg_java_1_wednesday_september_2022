package students.student_aleksandr_suhobokov;

public class DogApp {
    public static void main(String[] args) {

        Dog firstDog = new Dog();
        firstDog.name = "Chip";
        firstDog.age = 6;
        firstDog.isBig = true;
        firstDog.color = "white";

        System.out.println("My dogs name is: " + firstDog.name);
        System.out.println("My dogs age is: " + firstDog.age);
        System.out.println("My dog is big: " + firstDog.isBig);
        System.out.println("My dogs color is: " + firstDog.color);

        firstDog.age = 7;

        System.out.println("My dogs name is: " + firstDog.age);

        Dog secondDog = new Dog("Susan", 12, false, "black");

        System.out.println("___________________________________");
        System.out.println("My dogs name is: " + secondDog.name);
        System.out.println("My dogs age is: " + secondDog.age);
        System.out.println("My dog is big: " + secondDog.isBig);
        System.out.println("My dogs color is: " + secondDog.color);

        Dog thirdDog = new Dog("Vasja", 3);
        thirdDog.bark();


        String thirdDogsName = thirdDog.name;
        thirdDog.greeting(thirdDog.name);

        System.out.println(thirdDogsName + " - Vozrast posle 5 let, raven " + thirdDog.yearsAfterFiveYear(thirdDog));


        }


    }





