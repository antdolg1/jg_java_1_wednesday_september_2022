package students.student_oskars_popens.lesson_9.level_2;

class Porsche911 extends Car {
    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

}
