package students.student_igor_budnitski.lesson_3.homework.level_7.task_30;

class Circle {
    double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (this.Radius * this.Radius);
    }
}
