package students.student_sergejs_kozinecs.lesson_4.level_6.Task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.googleStockTest();
        stockTest.getPriceInfoTest();
        stockTest.simpleTest();
        stockTest.maxNineNineNineTest();
        stockTest.maxNineNineNineOneTest();
        stockTest.maxThousandTest();
        stockTest.maxThousandEightTest();
        stockTest.maxTwentySevenTest();
    }

    boolean areValuesValid(Stock stock, int expectedPrice, int expectedMinPrice, int expectedMaxPrice) {
        if (stock.price == expectedPrice && stock.minPrice == expectedMinPrice && stock.maxPrice == expectedMaxPrice) {
            return true;
        } else {
            return false;
        }
    }

    boolean isMaxPriceValid(Stock stock, int expectedMaxPrice) {
        return stock.maxPrice == expectedMaxPrice;
    }

    void googleStockTest() {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }

    void simpleTest() {
        Stock testStock = new Stock("KEK", 10);
        int expectedPrice = 77;
        int expectedMaxPrice = 99;
        int expectedMinPrice = 5;

        testStock.updatePrice(12);
        testStock.updatePrice(5);
        testStock.updatePrice(7);
        testStock.updatePrice(99);
        testStock.updatePrice(77);

        if (areValuesValid(testStock, expectedPrice, expectedMinPrice, expectedMaxPrice)) {
            System.out.println("Simple test OK");
        } else {
            System.out.println("Simple test FAIL");
        }
    }

    void maxNineNineNineTest() {
        Stock testStock = new Stock("KEK", 999);
        int expectedMaxPrice = 999;

        if (isMaxPriceValid(testStock, expectedMaxPrice)) {
            System.out.println("Max value 999 test OK");
        } else {
            System.out.println("Max value 999 test FAIL");

        }
    }

    void maxNineNineNineOneTest() {
        Stock testStock = new Stock("KEK", 999);
        testStock.updatePrice(1);
        int expectedMaxPrice = 999;

        if (isMaxPriceValid(testStock, expectedMaxPrice)) {
            System.out.println("Max value 999 to 1 test OK");
        } else {
            System.out.println("Max value 999 to 1 test FAIL");

        }
    }

    void maxThousandTest() {
        Stock testStock = new Stock("KEK", 999);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        int expectedMaxPrice = 1000;

        if (isMaxPriceValid(testStock, expectedMaxPrice)) {
            System.out.println("Max value 1000 test OK");
        } else {
            System.out.println("Max value 1000 test FAIL");

        }
    }

    void maxThousandEightTest() {
        Stock testStock = new Stock("KEK", 999);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        testStock.updatePrice(8);
        int expectedMaxPrice = 1000;

        if (isMaxPriceValid(testStock, expectedMaxPrice)) {
            System.out.println("Max value 1000 to 8 test OK");
        } else {
            System.out.println("Max value 1000 to 8 test FAIL");

        }
    }

    void maxTwentySevenTest() {
        Stock testStock = new Stock("KEK", 9);
        testStock.updatePrice(27);
        int expectedMaxPrice = 27;

        if (isMaxPriceValid(testStock, expectedMaxPrice)) {
            System.out.println("Max value 27 test OK");
        } else {
            System.out.println("Max value 27 test FAIL");

        }
    }

    void getPriceInfoTest() {
        Stock testStock = new Stock("KEK", 10);
        String testStockInformation = testStock.getPriceInformation();
        String expectedResult = "Company = \"KEK\", Current Price = 10, Min Price = 10, Max Price = 10";

        if (testStockInformation.equals(expectedResult)) {
            System.out.println("Init test OK");
        } else {
            System.out.println("Init test FAIL");
        }

        testStock.updatePrice(12);
        testStockInformation = testStock.getPriceInformation();
        expectedResult = "Company = \"KEK\", Current Price = 12, Min Price = 10, Max Price = 12";

        if (testStockInformation.equals(expectedResult)) {
            System.out.println("Price change test OK");
        } else {
            System.out.println("Price change test FAIL");
        }
    }
}
