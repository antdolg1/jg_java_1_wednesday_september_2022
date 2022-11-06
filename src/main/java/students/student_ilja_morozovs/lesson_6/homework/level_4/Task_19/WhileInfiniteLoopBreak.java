package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_19;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = numberOne + 1;
        while (numberOne < numberTwo) {
            System.out.println("Learning JAVA");
            break;
        }
    }
}
