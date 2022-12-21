package students.student_svetlana_seda.lesson_9.homework.level_4;

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    private double height;

    private double base;

    public Triangle(String title, double side1, double side2, double side3, double height, double base) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return 0.5 * (base * height);
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

}
