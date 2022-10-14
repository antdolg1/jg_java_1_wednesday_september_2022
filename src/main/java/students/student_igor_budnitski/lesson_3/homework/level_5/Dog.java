package students.student_igor_budnitski.lesson_3.homework.level_5;

public class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("Dog name is " + name + " and he is " + age + " y.o.");
        System.out.println(name + " color is " + color);
    }

    public void happyBirthday() {
        age += 1;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }

}
