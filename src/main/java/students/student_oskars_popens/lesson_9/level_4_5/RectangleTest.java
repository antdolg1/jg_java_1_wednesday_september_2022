package students.student_oskars_popens.lesson_9.level_4_5;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 25);
        System.out.println("Rectangle length = " + rectangle.getSideOne());
        System.out.println("Rectangle width = " + rectangle.getSideTwo());
        System.out.println("Rectangle area = " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter = " + rectangle.calculatePerimeter());
    }
}
