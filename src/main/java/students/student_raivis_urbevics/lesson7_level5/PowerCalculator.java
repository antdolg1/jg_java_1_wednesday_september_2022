package students.student_raivis_urbevics.lesson7_level5;

class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println(powerCalculator.raisingNumber(3, 3));
    }

    public int raisingNumber(int number, int degreeNumber) {

        int result = 1;

        for (int i = 1; i <= degreeNumber; i++) {

            result = result * number;

        }
        return result;
    }
}
