package students.student_oskars_popens.lesson_4.level_6_middle;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE", 10);
        String priceInformation;

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

    }
}
