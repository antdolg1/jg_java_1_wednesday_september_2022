package students.student_danila_kolesnicenko.lesson5;

class ArrayWithThreeNumbers4 {
    public static void main(String[] args) {

        int[]a = new int[3];
        int sum = 0;
        for (int i = 0; i < a.length;i++) {
            a[i] = (int) (Math.random()*60);
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}