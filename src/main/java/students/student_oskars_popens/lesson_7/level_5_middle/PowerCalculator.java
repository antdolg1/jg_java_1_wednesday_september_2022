package students.student_oskars_popens.lesson_7.level_5_middle;

class PowerCalculator {
    public int numberToPower(int number, int power){
        int returnNmuber=1;
        for (int i = 0; i < power; i++) {
            returnNmuber *= number;
        }
        return returnNmuber;
    }
}
