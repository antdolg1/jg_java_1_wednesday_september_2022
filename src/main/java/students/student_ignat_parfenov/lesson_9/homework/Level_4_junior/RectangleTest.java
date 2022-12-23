package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 18);
        System.out.println("Rectangle first side = " + rectangle.getSideOne());
        System.out.println("Rectangle second side = " + rectangle.getSideTwo());
        System.out.println("Rectangle area = " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter = " + rectangle.calculatePerimeter());
    }
}
