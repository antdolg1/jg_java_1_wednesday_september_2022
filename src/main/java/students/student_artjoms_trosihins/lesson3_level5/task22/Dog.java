package students.student_artjoms_trosihins.lesson3_level5.task22;

class Dog {
    String colour;

    Dog(String colour) {
        this.colour = colour;
    }

    void voice() {
        System.out.println("Woof, woof, woof! My colour is " + colour);
    }

    void changeColor(String newColour) {
        colour = newColour;
    }
}
