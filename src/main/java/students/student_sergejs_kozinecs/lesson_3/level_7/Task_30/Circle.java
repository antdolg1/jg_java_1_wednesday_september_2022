package students.student_sergejs_kozinecs.lesson_3.level_7.Task_30;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
