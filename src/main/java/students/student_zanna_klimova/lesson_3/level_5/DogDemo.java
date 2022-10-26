package students.student_zanna_klimova.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Rikki";
        dog.age = 5;
        dog.color = "red";

        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("black");
        dog.voice();

    }
}
