package students.student_maksims_cerkasovs.lesson_3.lessoncode;

public class Dog {

    String name;
    int age;
    boolean isBig;
    String colour;

//    public Dog(String name, int age, boolean isBig, String colour) {
//    this.name = name;
//    this.age = age;
//    this.isBig = isBig;
//    this.colour = colour;
//
//    }


    public Dog(String name, int age, boolean isBig, String colour) {
        this.name = name;
        this.age = age;
        this.isBig = isBig;
        this.colour = colour;
    }

    public Dog() {

}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {

        System.out.println("woof woof woof");

    }

    void greeting(String dogName) {
        System.out.println("Hello, my name is: " + dogName);
    }

    int yearsAfterFiveYears (Dog myDog) {
        int currentAge = myDog.age;
        currentAge = currentAge + 5;
        return currentAge;

    }


}


