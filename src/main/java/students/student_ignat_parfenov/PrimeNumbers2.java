package students.student_ignat_parfenov;

    public class PrimeNumbers2 {
        public static void main(String[] args) {

            for (int a = 2; a <= 30; a++) {
                boolean isPrime = true;

                for (int k = 2; k < a; k++)
                    if (a % k == 0) {
                        isPrime = false;
                        break;
                    }
                if (isPrime) {
                    System.out.println(a);
                }
            }
        }

    }








