package students.student_ignat_parfenov.lesson3.homework.Task18_22;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name = "Chicco";
        myDog.age = 6;

        String myDogName = myDog.name;
        myDog.voice(myDog.name);

        System.out.println(myDogName + myDogName + myDogName);
    }
}
