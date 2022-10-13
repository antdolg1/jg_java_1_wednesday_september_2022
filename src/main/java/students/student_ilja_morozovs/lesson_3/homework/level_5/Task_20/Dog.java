package students.student_ilja_morozovs.lesson_3.homework.level_5.Task_20;

public class Dog {
    int dogAge;

    public Dog(int dogAge) {
        this.dogAge = dogAge;
    }

    public int getDogAge() {
        return dogAge;
    }

    void voice() {
        System.out.println("Bark,Bark,Bark");
    }

    void happyBirthday() {
        System.out.println("Happy birthday");
        dogAge += 1;
    }
}
