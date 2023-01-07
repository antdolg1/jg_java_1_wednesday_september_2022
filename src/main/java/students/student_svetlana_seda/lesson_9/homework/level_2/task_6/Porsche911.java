package students.student_svetlana_seda.lesson_9.homework.level_2.task_6;

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
