package students.student_danila_kolesnicenko.lesson5;

class ArrayWithThreeNumbers6 {
    public static void main(String[] args) {

        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 56);
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] += 2;
            System.out.println(a[i]);
        }
    }
}
