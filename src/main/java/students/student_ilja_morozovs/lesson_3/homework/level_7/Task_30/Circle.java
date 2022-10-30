package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_30;

class Circle {
    double radius;

    double circleArea;

    public double getCircleArea() {
        return circleArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double rad = getRadius();
        return Math.PI * (rad * rad);
    }
}
