package students.student_deniss_fiscevs.lesson03.level_5_middle.task_20;

public class Dog {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }

    void voice() {
        System.out.println(name + ", " + name + ", " + name + "!");
    }

    int happyBirthday(Dog firstDog) {
        int currentAge = firstDog.age;
        currentAge = currentAge + 1;
        return currentAge;
    }

}
