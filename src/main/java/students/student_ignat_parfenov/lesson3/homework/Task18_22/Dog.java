package students.student_ignat_parfenov.lesson3.homework.Task18_22;

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
        System.out.println("My dogs name is " + name + " and hi is " + age + " y.o.");
    }

    public void happyBirthday() {
        age += 1;
        System.out.println("Voice!!");
        System.out.println("Hi! I am " + name + ". Wow, today is my Birthday and I am " + age + " y.o.");
    }

}
