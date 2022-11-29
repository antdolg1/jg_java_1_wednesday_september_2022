package students.student_stivens_veveris.lesson4.level4;

 class Calculator {

     public int sum(int firstNumber, int secondNumber) {
         return firstNumber + secondNumber;
     }

     public int sub(int firstNumber, int secondNumber) {
         return firstNumber - secondNumber;
     }

     public int mul(int firstNumber, int secondNumber) {
         return firstNumber * secondNumber;
     }

     public int div(int firstNumber, int secondNumber) {
         return firstNumber / secondNumber;
     }

     public boolean isEven(int number) {
         return number % 2 == 0;
     }

     public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
         if (firstNumber > secondNumber) {
             return firstNumber;
         } else if (firstNumber < secondNumber) {
             return secondNumber;
         } else {
             return secondNumber;
         }
     }





     public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
         if (firstNumber > secondNumber && firstNumber > thirdNumber) {
             return firstNumber;
         } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
             return secondNumber;
         } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
             return thirdNumber;
         } else {
             return firstNumber;
         }
     }
 }

