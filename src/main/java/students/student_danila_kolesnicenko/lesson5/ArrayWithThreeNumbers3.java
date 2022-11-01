package students.student_danila_kolesnicenko.lesson5;

class ArrayWithThreeNumbers3 {
    public static void main(String[] args) {

        int[]a = new int[3];

       for (int i = 0; i < a.length;i++){
           a[i] = (int) (Math.random()*100+1);
           System.out.println(a[i]);
       }
    }
}
