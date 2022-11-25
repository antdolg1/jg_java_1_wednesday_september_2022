package students.student_raivis_urbevics.lesson6_level4.task20;

 class WhileLoopContinue {

    public static void main(String[] args) {
        int num = 0;
        while (num < 100) {
            if (num > 50) {
                continue;
            }
            System.out.println(num);
            num ++;
        }
    }
}
