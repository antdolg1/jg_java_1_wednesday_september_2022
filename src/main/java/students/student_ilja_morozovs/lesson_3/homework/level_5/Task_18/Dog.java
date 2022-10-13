package students.student_ilja_morozovs.lesson_3.homework.level_5.Task_18;

public class Dog {
    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName);
        }
    }
}
