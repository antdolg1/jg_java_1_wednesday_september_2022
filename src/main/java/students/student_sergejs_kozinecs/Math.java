package students.student_sergejs_kozinecs;

public class Math {
    int a;
    int b;

    // Testing constructor
    Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return this.a + this.b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
