package students.student_oskars_popens.lesson_6.level_4_junior;

//task_19
class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int breakPoint = 0;
        while (true) {
            System.out.println("infinity while loop ");
            breakPoint++;
            if (breakPoint > 100) {
                System.out.println("Break");
                break;
            }
        }
    }
}
