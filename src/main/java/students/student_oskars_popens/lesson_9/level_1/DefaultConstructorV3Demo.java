package students.student_oskars_popens.lesson_9.level_1;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println("fullName=" + defaultConstructorV3.getFullName());
        System.out.println("age=" + defaultConstructorV3.getAge());
        System.out.println("male=" + defaultConstructorV3.isMale());
        System.out.println("female=" + defaultConstructorV3.getFemale());
    }
}
