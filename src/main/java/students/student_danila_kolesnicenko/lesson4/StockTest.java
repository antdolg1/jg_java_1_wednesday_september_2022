package students.student_danila_kolesnicenko.lesson4;

class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
