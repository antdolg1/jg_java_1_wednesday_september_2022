package students.student_raivis_urbevics.lesson6_level4.task20;

  class ForLoopContinue {
      public static void main(String[] args) {
          for (int i = 0; i < 100; i++) {
              if (i  > 50) {
                  continue;
              }
              System.out.println(i);
          }
      }
  }
