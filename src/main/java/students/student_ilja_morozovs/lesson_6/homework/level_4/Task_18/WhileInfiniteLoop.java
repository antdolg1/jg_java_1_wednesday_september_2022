package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_18;

class WhileInfiniteLoop {
    public static void main(String[] args) {
        boolean infiniteLoop = true;
        int number = 0;
        while (infiniteLoop) {
            System.out.println(number++);
        }
    }
}
