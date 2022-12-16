package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_20;

class ForLoopContinue {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 6; i++) {
            a++;
            if (a == 3) {
                continue;
            }
            System.out.println(a);
        }
    }
}
