package students.student_oskars_popens.lesson_9.level_4_5;

class ShapeUtilTest {
    Shape[] prepareTestArray() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4, 4, 4);
        return shapes;
    }

    void printResult(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void shouldCalculateArea() {
        Shape[] shapes = prepareTestArray();
        double expectedCalculatedArea = 89.1936856877122;
        ShapeUtil shapeUtil = new ShapeUtil();
        double realCalculatedArea = shapeUtil.calculateArea(shapes);
        printResult(expectedCalculatedArea == realCalculatedArea);
    }

    void shouldCalculatePerimeter() {
        Shape[] shapes = prepareTestArray();
        double expectedCalculatedPerimeter = 69.13274122871834;
        ShapeUtil shapeUtil = new ShapeUtil();
        double realCalculatedPerimeter = shapeUtil.calculatePerimeter(shapes);
        printResult(expectedCalculatedPerimeter == realCalculatedPerimeter);
    }

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();
    }
}
