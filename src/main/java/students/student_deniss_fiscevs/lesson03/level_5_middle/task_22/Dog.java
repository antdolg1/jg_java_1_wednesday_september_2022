package students.student_deniss_fiscevs.lesson03.level_5_middle.task_22;

public class Dog {

    String name;
    int age;
    String color;


    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog() {
    }

    void voice() {
        System.out.println("Hi! My name is " + name + "! I'm a " + age + " years old. And my color is " + color + "!");
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }

}