package students.student_maksims_cerkasovs.lesson_3.lessoncode;

public class DogDemo {

    public static void main(String[] args) {

        Dog firstDog = new Dog();
        firstDog.name = "Bobik";
        firstDog.age = 6;
        firstDog.isBig = true;
        firstDog.colour = "black";

        System.out.println("My dogs name is: " + firstDog.name);
        System.out.println("My dogs age is: " + firstDog.age);
        System.out.println("My dogs is big: " + firstDog.isBig);
        System.out.println("My dogs colour is: " + firstDog.colour);

        firstDog.age = 7;

        System.out.println("My dogs age is: " + firstDog.age);

        Dog secongDog = new Dog("Susan", 12, false, "white");

        System.out.println("___________________________________");
        System.out.println("My dogs name is: " + secongDog.name);
        System.out.println("My dogs age is: " + secongDog.age);
        System.out.println("My dogs is big: " + secongDog.isBig);
        System.out.println("My dogs colour is: " + secongDog.colour);

        System.out.println("___________________________________");

        Dog thirdDog = new Dog("Jack", 1);
        thirdDog.bark();

        Dog fourthDog = new Dog("Den", 100);
        String thirdDogName = thirdDog.name;
        thirdDog.greeting(thirdDogName);
        secongDog.greeting(secongDog.name);

        System.out.println(thirdDogName + " age after five years will be " + thirdDog.yearsAfterFiveYears(thirdDog));


    }

}
