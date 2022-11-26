package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class StockMain {
    public static void main(String[] args) {
        Stock google = new Stock("Hoodie", 100, 200, 75);
        google.getPriceInformation();
        google.updatePrice(15);
        google.updatePrice(500);
        google.updatePrice(100);
        google.getPriceInformation();
    }
}

