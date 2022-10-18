package students.student_raivis_urbevics.lesson3_level5.task22;

public class Dog {
    String dogName;
    String dogColor;
    String newColor;

    public void dogVoice() {
        System.out.println("Hi my name is " + dogName + " and my color is " + dogColor);
    }
    void changeColor(String newColor) {
        dogColor=newColor;
        System.out.println("Hi my name is " + dogName + " and my color now  is " + dogColor);
    }
}



