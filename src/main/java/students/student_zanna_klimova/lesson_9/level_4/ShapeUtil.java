package students.student_zanna_klimova.lesson_9.level_4;


public class ShapeUtil {
    double createRandomCircle() {
        double radius = Math.random() * 100;
        return radius;
    }

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        System.out.println(shapeUtil.createRandomCircle());
    }
}
