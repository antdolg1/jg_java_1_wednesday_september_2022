package teacher.lesson_4.homework.level_5_middle.lesson_3.lessoncode;

public class DogDemo {

    public static void main(String[] args) {

        int number = 1;
        Dog firstDog = new Dog();
        firstDog.name = "Bobik";
        firstDog.age = 6;
        firstDog.isBig = true;
        firstDog.color = "black";

        System.out.println("My dogs name is: " + firstDog.name);
        System.out.println("My dogs age is: " + firstDog.age);
        System.out.println("My dogs is big: " + firstDog.isBig);
        System.out.println("My dogs color is: " + firstDog.color);

        firstDog.age = 7;

        System.out.println("My dogs age is: " + firstDog.age);

        Dog secondDog = new Dog("Susan", 12, false, "white");

        System.out.println("_________________________________");
        System.out.println("My dogs name is: " + secondDog.name);
        System.out.println("My dogs age is: " + secondDog.age);
        System.out.println("My dogs is big: " + secondDog.isBig);
        System.out.println("My dogs color is: " + secondDog.color);
        System.out.println("_________________________________");

        Dog thirdDog = new Dog("Jack", 1);
        thirdDog.bark();
        Dog fourthDog = new Dog("Den", 100);

        String thirdDogsName = thirdDog.name;
        thirdDog.greeting(thirdDogsName);
        secondDog.greeting(secondDog.name);

        System.out.println(thirdDogsName + " age after 5 years will be " + thirdDog.yearsAfterFiveYears(thirdDog));
    }

}
