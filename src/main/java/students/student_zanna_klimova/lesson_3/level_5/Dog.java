package students.student_zanna_klimova.lesson_3.level_5;

public class Dog {
    String name;
    int age;
    String color;
    String newColor;

    void voice() {
        System.out.println(name + "! " + name + "! "
                + name + "! " + name + " is " + age +
                " years old. " + name + "`s color is: " + color + ".");
    }
    void happyBirthday(){
        age += 1;
    }

    void changeColor(String newColor) {
        color = newColor;
    }
}
