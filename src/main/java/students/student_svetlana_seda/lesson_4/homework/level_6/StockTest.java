package students.student_svetlana_seda.lesson_4.homework.level_6;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();

    }

    void updatePriceTest() {
        int price = 190;
        int maxPriceResult = 300;
        int minPriceResult = 100;
        int currentPrice = 200;

        Stock stock  = new Stock("Samsung", 200, 300, 100);
        int realPriceResult = stock.updatePrice(price);
        if (realPriceResult >= maxPriceResult) {
            System.out.println("UpdatePriceTest is OK");
        } else {
            System.out.println("UpdatePriceTest is FAIL");
        }

        if (realPriceResult < minPriceResult) {
            System.out.println("UpdatePriceTest is OK");
        } else {
            System.out.println("UpdatePriceTest is FAIL");
        }

        if (realPriceResult == currentPrice) {
            System.out.println("UpdatePriceTest is OK");
        } else {
            System.out.println("UpdatePriceTest is FAIL");
        }

    }

}
