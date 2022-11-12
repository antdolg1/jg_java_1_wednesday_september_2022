package students.student_jurij_hlebnikov.lesson_3.homework;

public class Dog {

    String dogName;
    int howOld;

    Dog(String dogName, int howOld){
        this.dogName = dogName;
        this.howOld = howOld;
    }

    public Dog() {
    }

    public void dogVoice() {
        System.out.println(dogName.repeat(3));
        System.out.println(howOld + " Years Old");
    }

    public void dogNewAge() {
        System.out.println(dogName.repeat(3));
        System.out.println(howOld + 1);
    }


}
