package students.student_ilja_morozovs.lesson_3.homework.level_5.Task_19;

public class Dog {
    String dogName;
    int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName);
            System.out.println(age);
        }
    }
}
