package students.student_svetlana_seda.lesson_6.homework.level_4.task_20;

//продемонстрируйте
//как досрочно закончить текущую итерацию цикла for.
class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 1; i > 0; i++) {
            if (i > 3)
                continue;
            System.out.println("Infinitive FOR loop! - continue");
        }
    }

}
