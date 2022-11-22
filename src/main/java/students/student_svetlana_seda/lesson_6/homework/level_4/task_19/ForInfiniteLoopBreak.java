package students.student_svetlana_seda.lesson_6.homework.level_4.task_19;

//продемонстрируйте
//выход из бесконечного цикла реализованного при помощи цикла for.
class ForInfiniteLoopBreak {


    public static void main(String[] args) {

        for (int i = 1; i > 0; i++) {
            System.out.println("Infinitive FOR loop!");
            if (i > 0) {
                break;
            }
        }
    }

}
