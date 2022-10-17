package students.student_igor_budnitski.lesson_3.homework.level_7.task_29;

class Lamp {
    String model;
    boolean isOn;

    public Lamp(String model) {
        this.model = model;
    }

    void isOn(){
        isOn = true;
        System.out.println("Lamp " + model + " is ON");
    }

    void isOff(){
        isOn = false;
        System.out.println("Lamp " + model + " is OFF");
    }
}
