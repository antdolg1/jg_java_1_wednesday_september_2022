package students.student_konstantin_karetnikov.lesson_3.level_5;


class DogDemo {

    public static void main(String[] args) {
     Dog Dog = new Dog();
        Dog.dogName = "Bobik";
        Dog.age = 6;
        Dog.color = "Green";
        Dog.voice();
        System.out.println("--------------19");
        Dog.voice2();
        System.out.println("--------------20");
        Dog.voice3();
        Dog.happyBirthday();
        Dog.voice3();
        System.out.println("Current dog age is " + Dog.age + " years old.");
        System.out.println("--------------21");
        Dog.voice4();
        System.out.println("--------------22");
       System.out.println("Dog color is " + Dog.color);
        Dog.voice3();
        Dog.changeColor("Red");
        Dog.voice3();
        System.out.println("New dog color is " + Dog.color);
    }

}
