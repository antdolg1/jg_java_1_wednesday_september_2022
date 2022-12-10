package students.student_zanna_klimova.lesson_9.level_4;

class Circle extends Shape{
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double result = Math.PI * radius * radius;
        double resultRound = (double)Math.round(result);
        return resultRound;
    }

    @Override
    double calculatePerimeter() {
        double result = 2 * Math.PI * radius;
        double resultRound = (double)Math.round(result);
        return resultRound;
    }


}
