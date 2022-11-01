package students.student_svetlana_seda.lesson_3.level_5;

public class Dog {
    String name;
    int age;
    String color;
    String newColor;

    void voice() {
        System.out.println(name + ", " + name + ", " + name + "!");
    }

    void voice2() {
        System.out.println(name + " is " + age + " years old.");
    }

    void happyBirthday() {
        System.out.println("Dog's age will be " + (age + 1) + " in one year!");
    }

    void voice3() {
        System.out.println(name + " is " + age + " years old. She is " + color + ".");
    }

    void changeColor() {
        System.out.println("Dog is " + newColor + " now!!!");
    }

}

