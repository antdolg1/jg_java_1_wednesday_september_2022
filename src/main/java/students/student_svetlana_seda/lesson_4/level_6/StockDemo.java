package students.student_svetlana_seda.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {

        Stock microsoft = new Stock("Mic-o-stock", 666, 540, 999);
        microsoft.priceInformation();
        microsoft.updatePrice(777);
        microsoft.updatePrice(45);
        microsoft.updatePrice(999);
        microsoft.priceInformation();

    }
// последнее задание этого урока, признаюсь не допоняла, скопировала -  потом буду разбираться...
    //при его проверки - открывается class Calculator - выдает там ошибки, я их не понимаю - поэтому здесь ничего не могу проверить сейчас :(
}
