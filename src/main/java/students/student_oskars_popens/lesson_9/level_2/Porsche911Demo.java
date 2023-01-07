package students.student_oskars_popens.lesson_9.level_2;

public class Porsche911Demo {
    public static void main(String[] args) {
        Porsche911 car = new Porsche911(2020, 230);
        System.out.println("Year: " + car.getReleaseYear());
        System.out.println("Top speed: " + car.getTopSpeed());
    }
}
