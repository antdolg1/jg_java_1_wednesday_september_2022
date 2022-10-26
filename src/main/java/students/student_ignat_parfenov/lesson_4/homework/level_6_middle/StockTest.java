package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class StockTest {

    public static void main(String[] args) {

        StockTest test = new StockTest();
        test.testSeventySeven();

    }

    void testSeventySeven() {
    Stock Roche = new Stock("Roche", 10, 10, 10);

    Roche.getPriceInformation();
    Roche.updatePrice(12);

    }
}
