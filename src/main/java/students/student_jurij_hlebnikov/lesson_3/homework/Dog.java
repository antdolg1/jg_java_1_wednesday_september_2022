package students.student_jurij_hlebnikov.lesson_3.homework;

public class Dog {

    String dogName;
    int howOld;
    String color;

    Dog(String dogName, int howOld, String color) {
        this.dogName = dogName;
        this.howOld = howOld;
        this.color = color;
    }

    public Dog() {
    }

    public void dogVoice() {
        System.out.println(dogName.repeat(3));
        System.out.println(howOld + " Years Old");
        System.out.println("Dog color: " + color);
    }

    public void dogNewAge() {
        System.out.println(dogName.repeat(3));
        System.out.println(howOld + 1);
    }


}
