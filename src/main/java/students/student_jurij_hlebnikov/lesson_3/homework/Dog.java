package students.student_jurij_hlebnikov.lesson_3.homework;

public class Dog {

    String dogName;

    Dog(String dogName){
        this.dogName = dogName;
    }

    public Dog(){
    }

    public void dogVoice(){
        System.out.println(dogName.repeat(3));
    }

}
