package teacher.lesson_4.homework.level_5_middle.lesson_3.lessoncode;

public class Dog {

    String name;
    int age;
    boolean isBig;
    String color;

    public Dog(String name, int age, boolean isBig, String color) {
        this.name = name;
        this.age = age;
        this.isBig = isBig;
        this.color = color;
    }

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println("Woof woof woof!");
    }

    void greeting(String dogName) {
        System.out.println("Hello, my name is: " + dogName);
    }

    int yearsAfterFiveYears(Dog myDog) {
        int currentAge = myDog.age;
        currentAge = currentAge + 5;
        return currentAge;
    }

}
