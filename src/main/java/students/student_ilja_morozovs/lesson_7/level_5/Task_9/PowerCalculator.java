package students.student_ilja_morozovs.lesson_7.level_5.Task_9;

import java.util.Scanner;

class PowerCalculator {
    private double num;
    private int degree;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.numberEntering();
        powerCalculator.degreeEntering();
        double result = powerCalculator.exponentiation(powerCalculator.getNum(), powerCalculator.getDegree());
        System.out.println("Result is: " + result);
    }


    double exponentiation(double num, int degree) {
        double result = 1;
        for (double i = 1; i <=degree; i++) {
            result *= num;
        }
        return result;
    }

    void numberEntering() {
        System.out.println("Please enter the number: ");
        setNum(keyboardUtils());
    }

    void degreeEntering() {
        System.out.println("Please enter the number: ");
        setDegree((int) keyboardUtils());
    }

    static double keyboardUtils() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }


}
