package students.student_sergejs_kozinecs.lesson_2.level_1;

public class Calculator {
    int a, b;
    double x, y;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return this.a + this.b;
    }

    public int subtract() {
        return this.a - this.b;
    }

    public int divide() {
        return this.a / this.b;
    }

    public int multiply() {
        return this.a * this.b;
    }

    public double sumDouble() {
        return this.x + this.y;
    }

    public double subtractDouble() {
        return this.x - this.y;
    }

    public double divideDouble() {
        return this.x / this.y;
    }

    public double multiplyDouble() {
        return this.x * this.y;
    }
}
