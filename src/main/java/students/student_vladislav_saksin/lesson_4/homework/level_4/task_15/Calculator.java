package students.student_vladislav_saksin.lesson_4.homework.level_4.task_15;

class Calculator {

    public int maxOfThreeNumbers(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else return 0;

    }
}