package students.student_ignat_parfenov.lesson3.homework.task18_22;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Chicco", 6, "grey");
        myDog.voice();
        System.out.println("My dogs name is " + myDog.name + ", hi is " + myDog.age + " y.o." + " and hi is " + myDog.color);
        myDog.happyBirthday();
        myDog.voice();
        System.out.println("Hi! I am " + myDog.name + ". Wow, today is my Birthday and I am " + myDog.age + " y.o.");
        System.out.println("____________________________________");
        myDog.voice();
        myDog.changeColor("orange");
        System.out.println("Hi, I am " + myDog.name + " and now I became " + myDog.color);
    }
}
