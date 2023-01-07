package students.student_oskars_popens.lesson_9.level_4_5;

class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 10, 10);
        System.out.printf("Triangle sides a=%f b=%f c=%f\n",
                triangle.getSideA(),
                triangle.getSideB(),
                triangle.getSideC());
        System.out.println("Triangle perimeter: "+ triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());

    }

}
