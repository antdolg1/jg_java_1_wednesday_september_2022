package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class StockTest {

    public static void main(String[] args) {

        StockTest test = new StockTest();
        test.testSeventySeven();
        test.nineNinetyNineGreater();

    }

    void testSeventySeven() {
        Stock Roche = new Stock("Roche", 10, 10, 10);

        Roche.getPriceInformation();
        Roche.updatePrice(12);
        Roche.getPriceInformation();
        Roche.updatePrice(5);
        Roche.getPriceInformation();
        Roche.updatePrice(7);
        Roche.getPriceInformation();
        Roche.updatePrice(99);
        Roche.getPriceInformation();
        Roche.updatePrice(77);
        Roche.getPriceInformation();

    }

    void nineNinetyNineGreater() {
        int expectedResult = 999;
        Stock Roche = new Stock("Roche", 10, 10, 10);
        Roche.updatePrice(999);
        int realResult = Roche.updatePrice(Roche.maximumPrice);
        if (realResult == expectedResult) {
            System.out.println("999 Greater test is OK");
        } else {
            System.out.println("999 Greater test is FAIL");
        }
    }
}

