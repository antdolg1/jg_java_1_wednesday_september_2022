package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}

