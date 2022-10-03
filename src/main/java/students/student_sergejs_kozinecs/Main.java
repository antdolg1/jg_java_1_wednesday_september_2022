package students.student_sergejs_kozinecs;

public class Main {
    public static void main(String[] args) {
        Math math = new Math(4, 9);

        System.out.println("Sum test:");
        System.out.println(math.sum());
        System.out.println("Division test:");
        System.out.println(math.divide(5, 15));
        System.out.println(math.divide(50, 3));
        System.out.println("Multiplication test:");
        System.out.println(math.multiply(50, 3));
        System.out.println(math.multiply(4, -3));
    }
}
