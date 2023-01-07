package students.student_oskars_popens.lesson_9.level_4_5;

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Area is " + circle.calculateArea());
        System.out.println("Perimeter is " + circle.calculatePerimeter());
    }
}