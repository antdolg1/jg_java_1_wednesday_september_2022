package students.student_raivis_urbevics.lesson6_level4.task19;

   class ForInfiniteLoopBreak {

       public static void main(String[] args) {

           for (int i = 0; i < 100; i++) {
               if (i > 90) {
                   break;
               }
               System.out.println(i);
           }
       }
   }
