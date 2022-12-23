package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 16, 26);
        System.out.println("Triangle first side = " + triangle.getTriangleFirstSide());
        System.out.println("Triangle second side = " + triangle.getTriangleSecondSide());
        System.out.println("Triangle third side = " + triangle.getTriangleThirdSide());
        System.out.println("Triangle area = " + triangle.calculateArea());
        System.out.println("Triangle half perimeter = " + triangle.getTriangleHalfPerimeter());
        System.out.println("Triangle perimeter = " + triangle.calculatePerimeter());
    }
}
