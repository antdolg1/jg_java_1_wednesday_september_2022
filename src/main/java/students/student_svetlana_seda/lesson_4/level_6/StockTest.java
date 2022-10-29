package students.student_svetlana_seda.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {

        StockTest test = new StockTest();
        test.shouldCurrentChange();

    }

    void shouldCurrentChange() {

        public static void main (String[]args){

            StockTest test = new StockTest();
            test.shouldCurrentChange();

        }

        void shouldCurrentChange () {

            Stock victim = new Stock("Mic-o-stock", 100, 10, 150);
            int realUpdatePrice = victim.updatePrice(victim.maxValue);

            if (realUpdatePrice >= victim.maxValue) {
                System.out.println("Updated price MAX test is OK");
            } else {
                System.out.println("Updated price MAX test is FAIL");
            }
            if (realUpdatePrice > victim.minValue) {
                System.out.println("Updated price MIN test is OK");
            } else {
                System.out.println("Updated price MIN test is FAIL");
            }
            if (realUpdatePrice == victim.currentValue) {
                System.out.println("Updated price CURRENT test is OK");
                System.out.println(realUpdatePrice);
            } else {
                System.out.println("Updated price CURRENT test is OK");
            }
        }
// последнее задание этого урока, признаюсь не допоняла, скопировала -  потом буду разбираться...
        //при его проверки - открывается class Calculator - выдает там ошибки, я их не понимаю - поэтому здесь ничего не могу проверить сейчас :(
    }

}


