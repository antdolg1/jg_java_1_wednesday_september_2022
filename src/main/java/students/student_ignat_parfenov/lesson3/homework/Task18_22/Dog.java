package students.student_ignat_parfenov.lesson3.homework.Task18_22;

public class Dog {

    String name;
    int age;

    public Dog() {
    }

    public void voice(String name) {
        System.out.println("Voice!!");
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("My dogs name is " + name + " and hi is " + age + " y.o.");
    }

    public void happyBirthday() {
        age += 1;
    }

}
