package students.student_oskars_popens.lesson_3.level_5_middle;

class DogDemo {
    public static void main(String[] args) {

        //Task_18
        Dog myDog = new Dog("Barsik");
        myDog.voice();

        //Task_19
        Dog myNewDog = new Dog("Palkan", 8);
        myNewDog.voiceAge();

        //Task_20
        Dog myNewDog1 = new Dog("Rex", 5);
        myNewDog1.voiceAge();
        myNewDog1.happyBirthday();
        myNewDog1.voiceAge();

        //Task_21
        Dog myNewDog2 = new Dog("Bobik", 3, "White");
        myNewDog2.voiceAgeColor();

        //Task_22
        Dog myNewDog3 = new Dog("Rembo", 4, "Black");
        myNewDog3.voiceAgeColor();
        myNewDog3.changeColor("Brown");
        myNewDog3.voiceAgeColor();

    }

}
