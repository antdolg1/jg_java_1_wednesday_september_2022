package students.student_vladislav_saksin.lesson3.level5;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name = "Tuzik";
        myDog.age = 10;
        myDog.color = "black";
        myDog.newColor = "white";

        myDog.voiceDogName();
        System.out.println("===============================");
        myDog.voiceDogNameAge();
        System.out.println("===============================");
        myDog.happyBirthDay();
        System.out.println("===============================");
        myDog.voiceDogNameAgeColor();
        System.out.println("===============================");
        myDog.changeColor(myDog.newColor);
    }

}