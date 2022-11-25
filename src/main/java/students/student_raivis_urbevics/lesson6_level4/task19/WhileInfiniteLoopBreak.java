package students.student_raivis_urbevics.lesson6_level4.task19;

   class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int num = 0;
        while (true) {
            if (num == 234234) {
                break;
            }
            System.out.println(num);
            num ++;
        }
    }
}
