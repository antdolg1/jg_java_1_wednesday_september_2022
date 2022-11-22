package students.student_ilja_morozovs.lesson_7.level_5.Task_9;

import java.util.Scanner;

class PowerCalculator {
    private double num;
    private double degree;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.numberEntering();
        powerCalculator.degreeEntering();
        double result = powerCalculator.exponentiation(powerCalculator.getNum(), powerCalculator.getDegree());
        System.out.println("Result is: " + result);
    }


    double exponentiation(double num, double degree) {
        double result = 1;
        for (int i = 1; i <= degree; i++) {
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
        setDegree(keyboardUtils());
    }

    static double keyboardUtils() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }


}
