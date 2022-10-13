package students.student_ilja_morozovs.lesson_3.homework.level_5.Task_22;


public class Dog {
    String dogColor;

    public Dog(String dogColor) {
        this.dogColor = dogColor;
    }

    void dogVoice() {
        System.out.println("Bark,Bark,Bark");
    }

    void changeColor(String newColor) {
        dogColor = newColor;
    }
}
