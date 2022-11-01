package students.student_danila_kolesnicenko.lesson5;

class ArrayWithThreeNumbers5 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 34);
            sum = a[i] + sum;

        }
        sum = sum / a.length;
        System.out.println(sum);
    }
}
