package students.student_konstantin_karetnikov.lesson_3.level_5;

class Dog {
    int age;
    String dogName;
    String color;
    String newColor;
  void voice() {
      System.out.println(dogName + "! " + dogName + "! " + dogName + "!");
    }
    void voice2() {
        System.out.println(dogName + "! I am " + age + " years old.");
    }
    void happyBirthday() {
        age += 1;
        System.out.println("Dog birthday");
    }
    void voice3(){
        System.out.println("Woof! Woof! Woof!");
    }

    void voice4(){
        System.out.println("Dog name - " + dogName + "\n" + "Dog age - " + age + " years old "+ "\n" + "Dog color - " + color);
    }

    void changeColor(String newColor) {
        color = newColor;
        System.out.println("Dog shedding");
    }
    }

