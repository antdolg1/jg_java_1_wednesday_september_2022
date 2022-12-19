package students.student_zanna_klimova.lesson_7.level5;

public class PowerCalculator {
    public int exponentiation(int baseOfDegree, int exponent) {
        int resultOfExpo = 1;
        for (int i = 0; i < exponent; i++) {
            resultOfExpo *= exponent;
        }
        System.out.println(resultOfExpo);
        return resultOfExpo;
    }
}
