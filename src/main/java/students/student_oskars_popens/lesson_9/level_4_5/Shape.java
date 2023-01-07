package students.student_oskars_popens.lesson_9.level_4_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}