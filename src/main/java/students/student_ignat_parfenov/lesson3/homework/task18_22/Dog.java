package students.student_ignat_parfenov.lesson3.homework.task18_22;

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
        System.out.println("Voice!!");
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }

    public void happyBirthday() {
        age += 1;

    }

    public void changeColor(String newColor) {
        this.color = newColor;
        // напишите тут команду сохранения нового цвета в свойство класса
    }
}
