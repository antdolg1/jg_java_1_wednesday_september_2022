package students.student_svetlana_seda.lesson_4.level_6;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Google", 100, 190, 60);
        google.priceInformation();
        google.updatePrice(5);
        google.updatePrice(300);
        google.updatePrice(50);
        google.priceInformation();
    }
// последнее задание этого урока, признаюсь не допоняла, скопировала -  потом буду разбираться...
    //при его проверки - открывается class Calculator - выдает там ошибки, я их не понимаю - поэтому здесь ничего не могу проверить сейчас :(
}

