package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle area = " + circle.calculateArea());
        System.out.println("Circle perimeter = " + circle.calculatePerimeter());
    }
}
