package students.student_raivis_urbevics.lesson5_level2.task15;

      class IncreaseArray {
          public static void main(String[] args) {
              int[] numbers = new int[3];
              numbers[0] = ((int) (Math.random() * 100));
              numbers[1] = ((int) (Math.random() * 100));
              numbers[2] = ((int) (Math.random() * 100));
              System.out.println(numbers[0]);
              System.out.println(numbers[1]);
              System.out.println(numbers[2]);
              numbers[0] += 2;
              numbers[1] += 2;
              numbers[2] += 2;
              System.out.println(numbers[0]);
              System.out.println(numbers[1]);
              System.out.println(numbers[2]);
          }
      }

