package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_19;

class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i < i + 1) {
            System.out.println("Learning JAVA");
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}
