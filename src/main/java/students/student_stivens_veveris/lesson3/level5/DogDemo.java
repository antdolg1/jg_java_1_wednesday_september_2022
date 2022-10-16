package students.student_stivens_veveris.lesson3.level5;

public class DogDemo {

    public static void main(String[] args) {

        Dog firstDog = new Dog();
        firstDog.age = 5;
        firstDog.color = "Black";
        firstDog.newColor = "White";

        firstDog.voice();
        firstDog.voice2();
        System.out.println("----------------------------------------");
        System.out.println("Happy birthday, " + firstDog.name + "!");
        System.out.println("Your age is " + firstDog.happyBirthday(firstDog) + "!");
        firstDog.voice();
        firstDog.changeColor(firstDog.newColor);
    }
}
