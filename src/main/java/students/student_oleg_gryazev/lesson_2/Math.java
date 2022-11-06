package students.student_oleg_gryazev.lesson_2;

 public class Math {
     int summa(int var1, int var2) {
         int result = var1 + var2;
         return result;
     }
    int divide(int var3, int var4){
         int result1 = var3/var4;
         return result1;
     }
 }

 class TestMath{
     public static void main(String[] args) {
         Math sum = new Math();
         int finSum = sum.summa(90,10);
         System.out.println(finSum);
         System.out.println(sum.summa(45,21));

         Math div = new Math();
         int finDiv = div.divide(50,3);
         System.out.println(finDiv);
         System.out.println(div.divide(50,3));

         int var3 = 50;
         int var4 = 3;
         System.out.println(var3*var4);


     }

    }






