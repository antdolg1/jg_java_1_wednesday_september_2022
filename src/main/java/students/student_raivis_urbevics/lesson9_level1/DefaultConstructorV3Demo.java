package students.student_raivis_urbevics.lesson9_level1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 person = new DefaultConstructorV3();
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Age = " + person.getAge());
        System.out.println("Male = " + person.isMale());
        System.out.println("Female " + person.isFemale());
    }
}
