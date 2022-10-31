package students.student_vladislav_saksin.lesson3.level5;

public class Dog {

    String name;
    int age;
    String color;
    String newColor;

    public Dog(String name) {
        this.name = name;
    }

    void voiceDogName() {
        System.out.println("My name is " + name + " " + name + " " + name);

    }

    void voiceDogNameAge() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");

    }

    void happyBirthDay() {
        System.out.println("My age after birthday is " + (age + 1) + " years.");

    }

    void voiceDogNameAgeColor() {
        System.out.println("My name is " + name + ". I am " + age + " years old. My color is " + color + ".");

    }

    void changeColor(String newColor) {
        System.out.println("My name is " + name + ". My color is " + color + ".");
        System.out.println("Hello again, my name is " + name + ". My new color is " + newColor + ".");
    }

    public Dog() {
    }
}