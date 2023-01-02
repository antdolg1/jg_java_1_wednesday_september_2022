package students.student_svetlana_seda.lesson_4.homework.level_6;

class StockDemo {
    public static void main(String[] args) {

        Stock phone = new Stock("Nokia", 100, 200, 50);
        phone.getPriceInformation();
        phone.updatePrice(180);
        phone.updatePrice(300);
        phone.getPriceInformation();

    }

}
