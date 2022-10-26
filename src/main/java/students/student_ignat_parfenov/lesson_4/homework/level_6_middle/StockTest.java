package students.student_ignat_parfenov.lesson_4.homework.level_6_middle;

public class StockTest {

    public static void main(String[] args) {

        StockTest test = new StockTest();
        test.testSeventySeven();
        test.nineNinetyNineGreater();
        test.nineNinetyNineOneGreater();
        test.nineNinetyNineTwoThousandEightTest();
        test.nineNinetyNineTwoThousandGreater();
        test.nineAndTwentySevenGreater();

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

    void nineNinetyNineOneGreater() {
        int expectedResult = 999;
        Stock Roche = new Stock("Roche", 10, 10, 10);
        Roche.updatePrice(999);
        Roche.updatePrice(1);
        int realResult = Roche.updatePrice(Roche.maximumPrice);
        if (realResult == expectedResult) {
            System.out.println("999 Greater then 1 test = OK");
        } else {
            System.out.println("999 Greater then 1 test = FAIL");
        }
    }

    void nineNinetyNineTwoThousandGreater() {
        int expectedResult = 1000;
        Stock Roche = new Stock("Roche", 10, 10, 10);
        Roche.updatePrice(999);
        Roche.updatePrice(2);
        Roche.updatePrice(1000);
        int realResult = Roche.updatePrice(Roche.maximumPrice);
        if (realResult == expectedResult) {
            System.out.println("1000 Greater test is OK");
        } else {
            System.out.println("1000 Greater test is FAIL");
        }
    }

    void nineNinetyNineTwoThousandEightTest() {
        int expectedResult = 1000;
        Stock Roche = new Stock("Roche", 10, 10, 10);
        Roche.updatePrice(999);
        Roche.updatePrice(2);
        Roche.updatePrice(1000);
        Roche.updatePrice(8);
        int realResult = Roche.updatePrice(Roche.maximumPrice);
        if (realResult == expectedResult) {
            System.out.println("1000 Greater then 8 test - OK");
        } else {
            System.out.println("1000 Greater then 8 test - FAIL");
        }
    }
    void nineAndTwentySevenGreater() {
        int expectedResult = 27;
        Stock Roche = new Stock("Roche", 10, 10, 10);
        Roche.updatePrice(9);
        Roche.updatePrice(27);
        int realResult = Roche.updatePrice(Roche.maximumPrice);
        if (realResult == expectedResult) {
            System.out.println("27 Greater test is OK");
        } else {
            System.out.println("27 Greater test is FAIL");
        }
    }
}

