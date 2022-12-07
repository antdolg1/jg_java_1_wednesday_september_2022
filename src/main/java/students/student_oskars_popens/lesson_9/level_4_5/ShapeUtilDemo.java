package students.student_oskars_popens.lesson_9.level_4_5;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtilDemo demo = new ShapeUtilDemo();
        demo.demoCircle();
        demo.demoSquare();
        demo.demoRectangle();
        demo.demoTriangle();
    }

    void demoCircle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double area = shapeUtil.calculateArea(circle);
        double perimeter = shapeUtil.calculatePerimeter(circle);
        printResult("Circle", area, perimeter);
    }

    void demoSquare() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomSquare();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        printResult("Square", area, perimeter);
    }

    void demoRectangle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomRectangle();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        printResult("Rectangle", area, perimeter);
    }

    void demoTriangle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomTriangle();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        printResult("Triangle", area, perimeter);
    }

    void printResult(String shape, double area, double perimeter) {
        System.out.printf("%s area: %f, perimeter: %f\n", shape, area, perimeter);
    }
}
