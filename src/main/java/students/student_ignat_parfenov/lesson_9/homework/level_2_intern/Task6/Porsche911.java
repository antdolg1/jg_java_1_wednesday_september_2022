package students.student_ignat_parfenov.lesson_9.homework.level_2_intern.Task6;

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Porsche911{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}


